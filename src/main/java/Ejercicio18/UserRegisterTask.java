package Ejercicio18;

public class UserRegisterTask implements Runnable{

    private User user;
    private UserRegister userRegister;

    public UserRegisterTask(User user, UserRegister userRegister){
        this.user = user;
        this.userRegister = userRegister;
    }

    @Override
    public void run(){
        try{
            userRegister.addUser(user);
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
