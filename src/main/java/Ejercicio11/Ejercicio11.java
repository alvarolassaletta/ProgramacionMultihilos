package Ejercicio11;


public class Ejercicio11 {
    static int counter =1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> {
           while(!Thread.currentThread().isInterrupted()){
                System.out.println("Contador: segundo: "+ counter);
                try{
                    Thread.sleep(1000);
                    counter++;
                }catch (InterruptedException e){
                    System.out.println("Hilo interrumpido durante la suspesión de sleep");
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread1.start();

        try{
            Thread.sleep(5000);
        } catch(InterruptedException e ){
            e.printStackTrace();
        }
        thread1.interrupt();
    }
}
