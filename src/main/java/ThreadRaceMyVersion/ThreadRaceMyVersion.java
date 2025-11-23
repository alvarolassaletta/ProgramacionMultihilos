package ThreadRaceMyVersion;


import java.util.LinkedHashMap;
import java.util.Map;

public class ThreadRaceMyVersion implements Runnable {

    private static Map<Integer,String> podio= new LinkedHashMap<>();
    private static int posicionCarrera =1;
    private  static int counter=1;
    private int id;
    private String corredor ;
    private int  distancia  = 0;
    private boolean cansado =false;

     public ThreadRaceMyVersion(String corredor){

         this.corredor= corredor;
         this.id= counter;
         counter++;
     }
     @Override
     public void run(){

         while (distancia<100){
              this.descalificar();
              this.estaCansado();

             /*si no está cansado, avanza entre 1y 5 y
             * si está cansado, avanza entre 1 y 3 */
             this.distancia += (!cansado) ? (int) ((Math.random() *5) +1) : (int) ((Math.random() *3)+1);

             try{
                 Thread.sleep(100);
                 System.out.println("El corredor con id " +this.id + " y nombre " + this.corredor +
                         "  ha avanzado " + distancia + " metros en total");
                 this.cansado=false;

                 llegarMeta();

             } catch(InterruptedException e){
                 System.out.println("Corredor detenido ");
             }

         }

     }
     /**Método para descalificar a los corredores. Generamos un numero aleatorio
      * entre 1 y 30 y si ese número es 1, entendemos que el corredor ha
      * cometido una falta grave  y  descalificado
      *La distancia se establece en 0 y se muestra un mensaje */

     public void descalificar(){
         int numeroDescalificacion= (int) ((Math.random()*30)+1);
          if( numeroDescalificacion==1){
              this.distancia=0;
              System.out.println("El corredor con id " + this.id  + " y  nombre "
                      +this.corredor + " ha sido descalificado.  Vuelve a empezar");
          }
     }
     /** Método que genera un numero aleatorio entre 1 y 10 y si sale 1
      * el corredor estara cansado y avanzara mas lento.
      * El atributo cansado se establece como true cuando el numero generado sea 1
      * */
     public void estaCansado(){
         int numeroCansado = (int) ((Math.random()*10) +1);
         if(numeroCansado==1){
             this.cansado=true;
         }
     }

     /**Método para indicar cuando  un corredor llega a la meta
      * Cuando la distancia sea igual o mayor a 100, se lanza un mensaje
      * y se añade la posición en la que llega el corredor  y el nombre del  corredor
      * al mapa  podio*/

     public void llegarMeta(){

         if(distancia>=100){
             System.out.println(this.corredor+ " ha llegado a la meta");
             podio.put(posicionCarrera,this.corredor);
             posicionCarrera++;
         }
     }

     /**Método para  mostrar el resultado de la carrera contenido en el mapa podio
      * Se llamará en el main cuando finalicen  la ejecución de todos hilos representados por los distintos
      *  corredores
      * */
     public static void mostrarPodio(){
        for(Map.Entry<Integer,String> entrada: podio.entrySet()){
            int posicion = entrada.getKey();
            String corredor = entrada.getValue();
            System.out.println(posicion +"º" +  " posición: " + corredor);
        }
     }





}
