package Ejercicio06;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThreadRaceSimulation implements Runnable{

    private static final  int  FINISH_LINE= 100;
    private static Map<Integer,String> podium = new LinkedHashMap<>();
    private static Integer racePosition= 1;

    private Integer distance =0;
    private String participant;

    public ThreadRaceSimulation(String participant){
        this.participant=participant;
    }

    @Override
    public void run(){
        while(distance<FINISH_LINE){
            this.distance+= (int) ((Math.random()*5)+1);
            System.out.println("El corredor " + participant+ " ha avanzado: " + distance + " metros");
            reachFinishLine();
            try{
                Thread.sleep(100);

            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    /**Método para indicar cuando  un corredor llega a la meta
     * Cuando la distancia sea igual o mayor a 100, se lanza un mensaje
     * y se añade la posición en la que llega el corredor  y el nombre del  corredor
     * al mapa  podio
     * Declaramos un bloque sincronizado para proteger las variables estaticas compartidas
     * entre los distintos hilos*/

    public  void  reachFinishLine(){
        synchronized (ThreadRaceSimulation.class){
            if(distance>=FINISH_LINE){
                System.out.println(participant+" ha llegado a la meta");
                podium.put(racePosition,participant);
                racePosition++;
            }
        }


    }
    /**Método para  mostrar el resultado de la carrera contenido en el mapa podio
     * Se llamará en el main cuando finalicen  la ejecución de todos hilos representados por los distintos
     *  corredores
     * */
    public static  void displayPodium(){
        for(Map.Entry<Integer,String> entry: podium.entrySet()){
            int racePosition = entry.getKey();
            String participant = entry.getValue();
            System.out.println(racePosition + "º: " +participant );
        }
    }


}
