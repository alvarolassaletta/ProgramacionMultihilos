package Ejercicio06;

import javax.imageio.metadata.IIOMetadataNode;

public class Main {
    public static void main(String[] args) {
        ThreadRaceSimulation ant  = new ThreadRaceSimulation("Hormiga");
        ThreadRaceSimulation snake  = new ThreadRaceSimulation("Serpiente");
        ThreadRaceSimulation snail  = new ThreadRaceSimulation("Snail");

        Thread thread1 = new Thread(ant);
        Thread thread2 = new Thread(snake);
        Thread thread3 = new Thread(snail);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("La carrera ha finalizado");
        ThreadRaceSimulation.displayPodium();

    }

}
