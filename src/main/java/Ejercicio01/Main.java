package Ejercicio01;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Ejercicio01 e1= new Ejercicio01();
        Thread hilo = new Thread(e1);

        System.out.println("---Usando Run---");
        hilo.run();
        System.out.println("---Fin de Run---");


        Thread hilo2= new Thread(e1);
        System.out.println("---Usando start ---");
        hilo2.start();
        System.out.println("---Fin de start---");

        /*¿Por qué  en la consola aparece antes "---Fin de start---" que el bucle?
         -> el hilo main continua su ejecución cuando se ejecuta start  y se crea
         el nuevo hilo */

    }
}
