package Ejercicio12;



public class Ejercicio12 {
    public static void main(String[] args) {

        Thread thread1= new Thread(()->{
            System.out.println("1ª descarga");
            int seconds = (int) (Math.random()*5)+1;
            try {
                Thread.sleep(seconds*1000);
                System.out.println("Descarga 1 terminada en " + seconds +" segundos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread thread2 = new Thread(()->{
            System.out.println("2ª descarga");
            int seconds = (int) (Math.random()*5)+1;
            try {
                Thread.sleep(seconds*1000);
                System.out.println("Descarga 1 terminada en " + seconds +" segundos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(()->{
            System.out.println("3ª descarga");
            int seconds = (int) (Math.random()*5)+1;
            try {
                Thread.sleep(seconds*1000);
                System.out.println("Descarga 1 terminada en " + seconds +" segundos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Descargas finalizadas. El hilo main continúa.");
    }
}
