package Ejercicio04;

public class Main {
    public static void main(String[] args)  {

        try{
            System.out.println("--HILO MAIN iniciado--");

            HiloAlfa ha = new HiloAlfa();
            HiloBeta hb = new HiloBeta();

            Thread  hiloA =  new Thread(ha);
            Thread hiloB = new Thread(hb);

            hiloA.start();

            hiloA.join();
            System.out.println("  --HILO MAIN-- se paraliza hasta que termine HiloAlfa  y hilo Beta no comenzara su " +
                    "ejecución hasta que hiloAlfa termine ");

            hiloB.start();

        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
