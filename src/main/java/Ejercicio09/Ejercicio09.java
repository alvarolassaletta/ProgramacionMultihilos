package Ejercicio09;

public class Ejercicio09 {
    public static final int TRAFFIC_LIGHT_CYCLE= 3;
    public static void main(String[] args) {

        /**Hilos con Runnable usando lambda*/

        Thread trafficLight = new Thread(()->{
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
        });

        trafficLight.start();


        while (trafficLight.isAlive()){
            System.out.println("Semáforo funcionando");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }



    }
}
