package Ejercicio16;


/**
 * Representa a un cocinero que implementa la interfaz Runnable para trabajar
 * en un hilo. Simula la preparación de un pedido, con un tiempo de proceso
 * aleatorio de 1 a 3 segundos.
 */
public class Cook  implements  Runnable{

    private String name;

    /**
     * Constructor para crear un nuevo Cook.
     * @param name Nombre del cocinero.
     */
    public Cook(String name){
        this.name = name;
    }
    /**
     * Obtiene el nombre del cocinero.
     * @return El nombre del cocinero.
     */
    public String getName(){
        return this.name;
    }
    /**
     * Simula el tiempo que tarda el cocinero en preparar el pedido.
     * El tiempo es aleatorio (1 a 3 segundos).
     */
    public void makeOrder(){
        int seconds = (int) ((Math.random()*3)+1);
        //número entre  1 y 3
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Pedido preparado en "+ seconds +"  segundos por " + this.getName());
    }
    /**
     * Método run que se ejecuta al iniciar el hilo.
     * Invoca la simulación de la preparación del pedido.
     */
    @Override
    public void run(){
        this.makeOrder();
    }
}
