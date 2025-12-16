package Ejercicio18;

public class EmailTask  implements  Runnable{
    private Email email ;
    private User user;
    public EmailTask (Email email,User user){
        this.email = email;
        this.user = user;
    }
    @Override
    public void run(){
        try{
            System.out.println("Validando el email");
            Thread.sleep(1500);

            if(email.validateEmail()){
                System.out.println("Email válido : " + email.getEmailAddress());
                user.setEmail(email);
                System.out.println("Email del usuario : " + user.getEmail());
            } else{
                System.out.println("Email inválido");
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
