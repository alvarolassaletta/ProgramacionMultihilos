package Ejercicio09Beta;

public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        Thread  thread = new Thread(trafficLight);

        thread.start();


        while (thread.isAlive()){
            System.out.println("Semáforo funcionando");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
