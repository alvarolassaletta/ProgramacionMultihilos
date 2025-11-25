package Ejercicio04;


public class HiloBeta implements Runnable{
    @Override
    public void run(){
        System.out.println("Hilo Beta iniciado");
        System.out.println("Si estoy en ejecución, eso implica que ... ¡Hilo alfa ha temrinado! ");
        System.out.println("Hilo Beta terminado");

    }
}
