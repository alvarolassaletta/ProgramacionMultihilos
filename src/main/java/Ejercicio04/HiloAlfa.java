package Ejercicio04;

public class HiloAlfa implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Hilo Alfa iniciado");
            System.out.println("Este Alfa tarda 3 segundos en terminar");
            Thread.sleep(3000);
            System.out.println("Hilo Alfa terminado");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
