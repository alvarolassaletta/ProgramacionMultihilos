package Ejercicio03;

public class Ejercicio03 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Este hilo tarda dos segundos en terminar");
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }

}
