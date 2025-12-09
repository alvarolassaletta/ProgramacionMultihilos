package Ejercicio15;

public class Ejercicio15 {
    static boolean  flag = true;
    static int iterations = 20;
    public static void main(String[] args) {

        /**
         * La flag está inicializada en true, asi que casi siempre se imprimirá primero PING
         * El hilo PONG estará 'encerrado' en el bucle while hasta que el hilo PING
         * cambie el valor de la flag a false. Cuando ocurra, el hilo PONG imprime PONG
         * Mientras, el hilo PING estará 'encerado' por el while hasta que el hilo PONG  cambie
         * el valor de la flag a true.
         * De esta forma se consigue la alternacia entre PING Y PONG sin que haya pérdida de turnos*/

        Thread ping = new Thread(() -> {

            for (int i = 0; i < iterations; i++) {

                while(!flag){
                    try{
                        Thread.sleep(1);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

                System.out.println("PING");
                flag = false;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread pong = new Thread(() -> {

            for (int i = 0; i < iterations; i++) {

                while(flag){
                    try{
                        Thread.sleep(1);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

                System.out.println("PONG");
                flag = true;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        ping.start();
        pong.start();

        try {
            ping.join();
            pong.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El ping-pong terminó");
    }
}
