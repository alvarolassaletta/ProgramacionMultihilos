package Ejercicio17;

    /*17. Ejercicio: Fabricación de piezas
    Tres hilos:
    1. Hilo A fabrica la pieza base (tarda 2s).
    2. Hilo B pule la pieza (tarda 1s) → solo puede empezar cuando A termine.
    3. Hilo C pinta la pieza (tarda 3s) → solo puede empezar cuando B termine.
    Usa cadena de join()*/

public class Ejercicio17 {
    public static void main(String[] args) {


        // (Definición de hilos MAKE, POLISH, PAINT...)
        
        Thread make = new Thread(()->{

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Pieza fabricada");
        });

        Thread polish = new Thread(()->{

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Pieza  pulida");
        });
        Thread paint = new Thread(()->{

            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        });
        //creamos el hilo
        make.start();
        //el hilo main espera a que la fabricación finalice
        try {
            make.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        //creamos  el hilo
        polish.start();

        //el hilo main espera a que el pulido finalice
        try{
            polish.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //creamos el hilo
        paint.start();

        //el hilo main espera a que el pintado finalice
        try{
            paint.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
