package Ejercicio08Beta;

public class Pares  implements Runnable{
    @Override
    public void run(){
        printEvenNumbers();
    }

    public void printEvenNumbers(){
        for(int i=0;i<=20;i+=2){
            try{
                System.out.println(i+ " " + Thread.currentThread().getName());
                Thread.sleep(200);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}


