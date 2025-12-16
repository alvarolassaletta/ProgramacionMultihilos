package Ejercicio18;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

    /** Tarea que permite enviar un correo electrónico usando JavaMail
     * Si se usa gmail, hay que activar  la autentifación en dos pasos
     * y establecer una contraseña específica distinta de la de inicio de sesión
     * No todas las cuentas de gmail lo permiten.
     * */
public class SendEmailTask  implements  Runnable{

    private String recipient;
    private String subject;
    private String messageBody;
    private String sender;
    private String senderPassword; // app password if using Gmail

    public SendEmailTask(String recipient, String subject, String messageBody,
                         String sender, String senderPassword) {
        this.recipient = recipient;
        this.subject = subject;
        this.messageBody = messageBody;
        this.sender = sender;
        this.senderPassword = senderPassword;
    }

    /**
     * Método que se ejecuta al iniciar el hilo.
     * Configura la conexión SMTP, crea el mensaje y lo envía.
     * Captura excepciones de interrupción y errores de mensajería.
     */
    @Override
    public void run() {
        try {
            System.out.println("Sending email...");
            Thread.sleep(1000);

            // Configuración  SMTP
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            // Se crea  una sesión con autentificación
            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(sender, senderPassword);
                        }
                    });

            // Se crea el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageBody);

            // Se manda el email
            Transport.send(message);
            System.out.println("Email sent to: " + recipient);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
