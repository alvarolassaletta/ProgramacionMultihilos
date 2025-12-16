package Ejercicio18;


public class Main {
    public static void main(String[] args) {


        //1. REGISTRAR USUARIO

        User user= new User("Alvaro", "Lassaletta" );
        UserRegister userRegister = new UserRegister();
        UserRegisterTask registerTask = new UserRegisterTask(user,userRegister);
        Thread registerThread = new Thread(registerTask);

        registerThread.start();
        try{
            registerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------Registro de usuario finalizado-------");

        // 2. VALIDAR EMAIL

        Email email = new Email("correoEjemplo@ejemplo.com");
        EmailTask emailTask = new EmailTask(email,user);
        Thread emailThread= new Thread(emailTask);

        emailThread.start();
        try{
            emailThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("------Validación de Email finalizada-------");

        // 3. CREAR CARPETA PERSONAL

        DirectoryTask directoryTask = new DirectoryTask(user);
        Thread directoryThread= new Thread(directoryTask);

        directoryThread.start();
        try{
            directoryThread.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("------Creación de directorio personal finalizada -------");

        // 4. ENVIAR EMAIL

        /**No se  proveen los correos, ni la contraseña
         * Si se quiere probar con cuentas de gmail, hay que asegurarse
         * de activiar la verificación en dos pasos en la cuenta remitente
         * y establecer uan contraseña específica para el servicio
         *
         * Sin correos válidos, el hilo (sendEmailThread)  que ejecuta
         * la EmailTask lanzará uan excepción*/

        String subject = "Correo de prueba";
        String messageBody = "Este es un correo de prueba";
        String sender = "tu_correo@tucorreo.com";
        //correo remitente
        String senderPassword = "";
        //contraseña secundaria establecida tras activar la verificación en dos pasos

        SendEmailTask sendEmailTask = new SendEmailTask(
                email.toString(),
                subject,
                messageBody,
                sender,
                senderPassword
        );

        Thread sendEmailThread = new Thread(sendEmailTask);
        sendEmailThread.start();
        try{
            sendEmailThread.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        System.out.println("------Envio del email finalizado-------");

    }
}
