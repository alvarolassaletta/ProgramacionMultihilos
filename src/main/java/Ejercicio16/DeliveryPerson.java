package Ejercicio16;

/**
 * Representa a un repartidor (DeliveryPerson) que implementa la interfaz Runnable
 * para trabajar en un hilo. Simula la entrega de un pedido, con un tiempo de
 * reparto aleatorio de 2 a 4 segundos.
 */
public class DeliveryPerson implements Runnable {
    private String name;

    /**
     * Constructor para crear un nuevo DeliveryPerson.
     * @param name Nombre del repartidor.
     */
    public DeliveryPerson(String name){
        this.name= name;
    }
    /**
     * Obtiene el nombre del repartidor.
     * @return El nombre del repartidor.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Simula el tiempo que tarda el repartidor en entregar el pedido.
     * El tiempo es aleatorio (2 a 4 segundos).
     */
    public  void deliverOrder(){
        int seconds = (int) ((Math.random()*3)+2);
        //número entre 2 y 4
        try {
            Thread.sleep(seconds * 1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Pedido entregado en "+ seconds + " segundos  por " + this.getName());

    }
    /**
     * Método run que se ejecuta al iniciar el hilo.
     * Invoca la simulación de la entrega del pedido.
     */
    @Override
    public void run(){

        this.deliverOrder();
    }
}
