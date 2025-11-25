package Ejercicio02;


public class Main {
    public static void main(String[] args) {
        try{
            Ejercicio02 e2= new Ejercicio02();
            Thread hilo = new Thread(e2);
            hilo.start();

            while(hilo.isAlive()){
                Thread.sleep(300);
                System.out.println("Main sigue...");
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }


    }
}
