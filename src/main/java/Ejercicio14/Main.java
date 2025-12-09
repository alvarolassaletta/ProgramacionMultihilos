package Ejercicio14;
/**14. Ejercicio: Control de proceso con isAlive()
Un hilo va procesando 10 pasos con sleep(400).
        Mientras tanto, el main:
        • Cada 300 ms imprime si el hilo sigue vivo o ya ha terminado usando isAlive().
        • Cuando termine, imprime "Proceso acabado".*/


public class Main {
    public static void main(String[] args) {

        Stroll stroll = new Stroll();
        Thread thread1 = new Thread(stroll,"Hilo caminante");

        thread1.start();

        while(thread1.isAlive()){
            System.out.println("El " + thread1.getName() + " sigue de paseo");
            try{
                Thread.sleep(300);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("El paseo terminó.");






    }
}
