package Ejercicio07Beta;

public class MainBeta {
    public static void main(String[] args) {

        /**Otra forma de hacerlo en la que, en vez de implementar Runnable  directamente
         *  en una clase, se usa una funcion lambda. Esto es posible porque Runnable es una interfaz
         *  funcional(interfaces con un solo metodo abstracto -- el metodo run() en este caso--) y las
         *  interfaces funcionales permiten esta implementación mediante lambda
         * */

        Thread thread1 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        });

        Thread thread2 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        });

        Thread thread3 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        });

        try{
            thread1.start();
            thread1.join();

             thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
