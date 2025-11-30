package Ejercicio08Beta;

public class Impares implements Runnable{

    @Override
    public void run(){
        printOddNumbers();
    }

    public void printOddNumbers(){
        for(int i=1;i<=20;i+=2){

            try{
                System.out.println(i+" " + Thread.currentThread().getName());
                Thread.sleep(200);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
