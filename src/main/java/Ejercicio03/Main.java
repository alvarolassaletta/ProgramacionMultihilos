package Ejercicio03;

public class Main {
    public static void main(String[] args) {

        Ejercicio03 e3 = new Ejercicio03();
        Thread hilo = new Thread(e3);

        try{
            //Antes de Start
            System.out.println("---Antes de start---");
            String mensaje = (hilo.isAlive()) ? "Esta vivo! :)": "No esta vivo :(";
            System.out.println("¿Esta el hilo creado vivo antes de start? " + mensaje);
            hilo.start();

            //Despues de start
            System.out.println("---Después de start---");
            mensaje = (hilo.isAlive()) ? "Esta vivo! :)": "No esta vivo :(";
            System.out.println("¿Esta el hilo creado vivo después de start? " + mensaje);

            //Después de Join
            hilo.join();
            System.out.println("---Después de Join---");
            mensaje = (hilo.isAlive()) ? "Esta vivo! :)": "No esta vivo :(";
            System.out.println("¿Esta el hilo creado vivo después de join()? " + mensaje);

            /*OUTPUT
            * ---Antes de start---
            ¿Esta el hilo creado vivo antes de start? No esta vivo :(
            ---Después de start---
            ¿Esta el hilo creado vivo después de start? Esta vivo! :)
            Este hilo tarda dos segundos en terminar
            ¿Esta el hilo creado vivo después de join()? No esta vivo :(
*/


        }catch(InterruptedException e){
            e.printStackTrace();
        }



    }
}
