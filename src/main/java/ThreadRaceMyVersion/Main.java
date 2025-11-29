package ThreadRaceMyVersion;

public class Main {
    public static void main(String[] args) {
        ThreadRaceMyVersion hormiga = new ThreadRaceMyVersion("Hormiga");
        ThreadRaceMyVersion caracol = new ThreadRaceMyVersion("Caracol");
        ThreadRaceMyVersion serpiente= new ThreadRaceMyVersion("Serpiente");
        ThreadRaceMyVersion liebre = new ThreadRaceMyVersion("Liebre");
        ThreadRaceMyVersion buho = new ThreadRaceMyVersion("Búho");

        Thread hiloHomriga= new Thread(hormiga);
        Thread hiloCaracol= new Thread(caracol);
        Thread hiloSerpiente= new Thread(serpiente);
        Thread hiloLiebre= new Thread(liebre);
        Thread hiloBuho= new Thread(buho);

        hiloHomriga.setPriority(3);
        hiloCaracol.setPriority(Thread.MIN_PRIORITY);
        hiloSerpiente.setPriority(Thread.NORM_PRIORITY);
        hiloLiebre.setPriority(7);
        hiloBuho.setPriority(Thread.MAX_PRIORITY);

        hiloHomriga.start();
        hiloCaracol.start();
        hiloSerpiente.start();
        hiloLiebre.start();
        hiloBuho.start();

        System.out.println("Let the race begin!");

        try{
            hiloHomriga.join();
            hiloCaracol.join();
            hiloSerpiente.join();
            hiloLiebre.join();
            hiloBuho.join();
        }catch(InterruptedException ie){
            System.out.println("Error en la detención del hilo main");
        }
        System.out.println("La carrera ha terminado.");
        ThreadRaceMyVersion.mostrarPodio();

        System.out.println("El hilo "+ Thread.currentThread().getName()+ " se reanuda y termina");
        System.out.println(" El hilo main sigue vivo = " + Thread.currentThread().isAlive());



    }
}
