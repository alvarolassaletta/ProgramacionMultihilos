package Ejercicio20;


public class Main {

    public static void main(String[] args) {

        Thread backUpThread = new Thread(()->{
            for(int i=1;i<=10;i++){
                System.out.println("Paso: " +i+ " completado. Quedan " +(10-i) + " pasos.");
                try{
                    int milisecons = (int) (Math.random()* (700-300+1))+300;
                    Thread.sleep(milisecons);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        backUpThread.start();

        int  total=0;
        boolean hasShown= true;

        while(backUpThread.isAlive()){
            System.out.println("Backup en ejecución");
            try{
                Thread.sleep(200);
                total+=200;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(total>= 3000 && hasShown){
                System.out.println("El backup lleva más de 3 segundos de ejecución ");
                hasShown= false;
            }
        }
        try{
            backUpThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("---Backup completado. Hilo Main continúa... ---");
    }
}
