package Ejercicio14;

public class Stroll  implements  Runnable{

    public static final int  END = 500;
    private  int distance;

    public Stroll(){
        this.distance=0;
    }

    public void walk(int steps) throws InterruptedException{

        while(distance<END){
            distance+=steps;
            System.out.println("Distancia recorriada: " + this.distance);
            Thread.sleep(400);
        }
    }
    @Override
    public void run(){
        try {
            walk(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
