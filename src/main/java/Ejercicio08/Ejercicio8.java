package Ejercicio08;

public class Ejercicio8 {
    public static final int END= 20;
    public static void main(String[] args) {

        /**Usando Lambda */

        Thread threadEven = new Thread(()->{
            for(int i=0;i<=END;i++){
                if(i % 2==0){
                    System.out.println(i+" " + Thread.currentThread().getName());
                    try{
                        Thread.sleep(200);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadOdd = new Thread(()->{
            for( int i=0;i<=END;i++){
                if(i%2 !=0){
                    System.out.println(i+ " "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadEven.start();
        threadOdd.start();

        try{
            threadEven.join();
            threadOdd.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
