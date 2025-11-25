package Ejercicio05;
/*5. Ejercicio: Prioridades
Crea 3 hilos:
• Uno con prioridad mínima.
• Otro con prioridad normal.
• Otro con prioridad máxima.
Cada hilo imprime su nombre 10 veces.
Observa el orden y explica si cambia según ejecuciones.*/



public class Ejercicio5 implements Runnable {
    private static  int counter=1;
    private  int id;

    public Ejercicio5(){
        this.id= counter;
        counter++;
    }


    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Nombre:  hilo nº"+this.id + " " + Thread.currentThread().getName());


        }

    }
}
