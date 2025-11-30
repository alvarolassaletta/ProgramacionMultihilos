package Ejercicio10;
/*10. Ejercicio: Contador compartido sin sincronización
  Crea 2 hilos que incrementen el mismo contador 1000 veces.
  Usa sleep(1) en algunas vueltas.
  Observa resultados distintos cada ejecución → condición de carrera.
  Explica por qué pasa.*/

public class Ejercicio10 {
    /**Usando Lambda */

    private static int counter=0;
    private  static final int END = 1000;

    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            for(int i= 0; i<END;i++){
                counter++;
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i= 0; i<END;i++){
                counter++;
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
           e.printStackTrace();
        }

        System.out.println("Valor final del counter: "+  counter);


        /**Explicación
         *
         * En cada ejecución, el valor final del counter es distinto. Se ha probado varias veces, y en  cada una
         *  se obtiene un valor distinto (1956,1967,1965,1966,etc.).
         *
         *  Este código ejemplifica una problemática denominada condiciones de carrera (race conditions):
         *  --Los hilos thread1 y thread2 se están ejecutando simultáneamente.
         *  --Hay un recurso compartido (la variable estática counter).
         *  --Los hilos realizan operaciones lectura, modificación y escritura sobre el
         *  recurso compartido sin sincronización. Cada hilo lee la variable counter, incrementa su valor en 1 y
         *  guarda la actualización. Las operaciones concurrentes de lectura no son el origen del problema, ya que son compatibles.
         *  El problema se localiza en las operaciones de escritura concurrentes sobre el recurso compartido.
         *  Las condiciones de carrera requieren operaciones de escritura por dos o más hilos sobre el recurso compartido.
         *
         *  Al no utilizar mecanismos para proteger el recurso compartido de las operaciones concurrentes de escritura
         *  , el resultado no es el esperado y varía en cada ejecución. Hay intercalamiento de instrucciones y pérdida de
         *  actualizaciones porque algunas de las operaciones de escritura de los hilos no logran acceder al recurso.

         * */

        
    }
}
