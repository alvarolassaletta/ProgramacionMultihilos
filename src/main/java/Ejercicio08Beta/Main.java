package Ejercicio08Beta;

public class Main {
    public static void main(String[] args) {

        /**Hago el ejercicio de la forma tradicional. Creando clases que implementen Runnable  y el método run
         y utilizando instancias que se pasan a instancias de la clase Thread.
         * de estas clases */

        Pares evenNumbers = new Pares();
        Impares oddNumbers = new Impares();

        Thread evenThread= new Thread(evenNumbers);
        Thread oddThread= new Thread(oddNumbers);

        evenThread.start();
        oddThread.start();

        try{
            evenThread.join();
            oddThread.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }
}
