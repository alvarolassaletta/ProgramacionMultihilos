package Ejercicio10Beta;

public class Counter  implements  Runnable{
    /**Usando Runnable de la forma  'tradicional'. Se crea una clase que implemente Runnable y sobreescriba
     * el metodo run(). En el main se crea una instancia de esta clase y instancias de Thread , a las que se pasa
     * la instancia de la clase que implementa Runnable */

    private  static final int END = 1000;
    static int counter=0;

    @Override
    public void run(){
        incrementar();
    }

    /**Usando synchronized en el metodo  estático
     * se protege el recurso compartido y se soluciona el problema de las condiciones de carrera */

    public static  synchronized void  incrementar(){
        for(int i= 0; i<END;i++){
            counter++;
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }



}
