package Ejercicio07;

public class Task implements Runnable {
    private static Integer counter = 1;
    private Integer id;
    private String name;


    public Task(String name){
        synchronized (Task.class){
            this.id= counter;
            this.name=name;
            counter++;
        }
        /*En principio, el synchonized no es necesario porque tal y como está el código en
        * el main  los hilos no llegan a hacer operaciones sobre la variable estática. No
        * llega a ser  un recurso compartido. La lectura en el método to String se hace sobre
        * la variable de instancia id. De todos modos, operaciones exclusivamente de lectura por
        * distintos hilos, no plantean problemas en la concurrencia.  */


    }

    public String toString(){
        return "Tarea:  id: " +id +", nombre: "+ name;
    }
    @Override
    public void run(){
        System.out.println(this.toString());
    }
}
