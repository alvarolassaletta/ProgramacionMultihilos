package Ejercicio13;


public class Ejercicio13 {
    public static void main(String[] args) {

        Thread thread1= new Thread(()->{
            for( int i=0;i<30;i++){
                System.out.println("Hilo: " +Thread.currentThread().getName());
                int num = (int) (Math.random()*9)+1;
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        });

        Thread thread2= new Thread(()->{
            for( int i=0;i<30;i++){
                System.out.println("Hilo: " +Thread.currentThread().getName());
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);

                thread1.setPriority( (int) (Math.random()*10)+1);
                thread2.setPriority( (int) (Math.random()*10)+1);

            }catch(InterruptedException e){
                e.printStackTrace();
            }



        }




    }
}
