package Ejercicio19;

/**
 * Este ejercicio ilustra la problemática del modelo productor-consumidor
 * que vienen a resolver los mecanismos de sincronización
 * como synchronined, wait() y notify()/notifyAll().
 *
 * El hilo consumidor consume mucho más rápido (cada 300 milisegundos)
 * de lo que produce el hilo productor (cada 700 milisegundos).
 * Esto provoca que el consumidor imprima el mismo número varias veces y que el
 * consumidor termine sus operaciones de lectura mucho antes de que termine el productor
 * */

public class Ejercicio19 {
    static int randomNumber=0;
    public static void main(String[] args) {

        Thread numberProducer = new Thread(()->{

            for(int i=0;i<10;i++){
                randomNumber= (int) (Math.random()*100);
                try{
                    Thread.sleep(700);
                    System.out.println("Producto genera: " + randomNumber);
                    System.out.println("Estado productor: "+Thread.currentThread().getState());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("---El productor termino de producir números---");
        });

        Thread numberConsumer = new Thread(()->{

            for(int i=0;i<10;i++){
                System.out.println("Numero consumido: "+randomNumber);
                try{
                    Thread.sleep(300);
                    System.out.println("Estado consumidor: " + Thread.currentThread().getState());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("---El consumidor termino de imprimir  números---");
        });

        numberProducer.start();
        numberConsumer.start();


        System.out.println("Ambos hilos terminan");
    }
}

