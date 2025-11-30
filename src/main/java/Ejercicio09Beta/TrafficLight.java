package Ejercicio09Beta;

/**Forma tradicional de usar Runnable. Creando una clase que implemtne la interfaz y el metodo run
 * y  usando  instnacias de esta clase para pasarselas a una instancia de Thread*/

public class TrafficLight implements Runnable {
    public static final int TRAFFIC_LIGHT_CYCLE= 3;

    @Override

    public void run(){
        try{
            for(int i=0;i<TRAFFIC_LIGHT_CYCLE;i++){
                System.out.println("VERDE");
                Thread.sleep(2000);

                System.out.println("AMARILLO");
                Thread.sleep(1000);

                System.out.println("ROJO");
                Thread.sleep(3000);
            }

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }



}
