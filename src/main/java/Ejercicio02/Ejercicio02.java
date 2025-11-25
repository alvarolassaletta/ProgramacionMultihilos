package Ejercicio02;

public class Ejercicio02 implements Runnable {
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("tic");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
