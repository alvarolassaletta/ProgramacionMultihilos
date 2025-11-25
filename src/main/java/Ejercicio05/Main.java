package Ejercicio05;

public class Main {
    public static void main(String[] args) {

        Ejercicio5 h1 = new Ejercicio5();
        Ejercicio5 h2 = new Ejercicio5();
        Ejercicio5 h3 = new Ejercicio5();

        Thread hilo1 = new Thread(h1);
        Thread hilo2 = new Thread(h2);
        Thread hilo3 = new Thread(h3);

        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
