package Ejercicio01;
/*1. Ejercicio: Diferencia entre run() y start()
Crea un programa que:
• Tenga un hilo que imprime números del 1 al 5.
• Llama a run() primero.
• Luego llama a start().
• Observa el orden de ejecución.
• Explica por qué ocurre.*/

public class Ejercicio01 implements Runnable {
    @Override
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println(i);
        }
    }
}
