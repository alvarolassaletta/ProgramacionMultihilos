package Ejercicio12Beta;

public class Download implements  Runnable{

    public static int  counter =1;
    private int id;
    private String name;

    public Download(String name){
        this.name = name;
        synchronized (Download.class){
            this.id = counter;
            counter++;
        }

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**Método  para simular uan descarga. Se imprime el id y el nombre de la descarga
     * y se pone a 'dormir' la descarga por una cantidad aleatoria de segundos entre 1 y 5 */

    public void download(){
        int seconds = (int) (Math.random()*5)+1;
        System.out.println("Descarga " + this.getId() + ", " +this.getName()+ " descargándose");
        try {
            Thread.sleep(seconds*1000);
            System.out.println("Descarga " + this.getId() + ", " +this.getName()+ " compleada en "+ seconds+ " segundos");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run(){
        this.download();
    }
}
