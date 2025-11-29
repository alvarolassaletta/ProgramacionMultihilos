package Ejercicio07;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Ejercicio Multihilos");
        Task task2 = new Task("Aplicación Kotlin");
        Task task3 = new Task("Modulo Odoo");

        Thread thread1 = new Thread(task1);
        Thread thread2= new Thread(task2);
        Thread thread3 = new Thread(task3);

        try{
            thread1.start();
            thread1.join(); // hilo main espera a que el hilo 1 termine

            thread2.start();
            thread2.join(); //  hilo main espera a que hilo 2 termine

            thread3.start();
            thread3.join();  // hilo main espera a que hilo3 termine


        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }

}
