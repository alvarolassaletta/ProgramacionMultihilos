package Ejercicio16;


public class Ejercicio16 {
    public static  int numOrders= 5;
    public static void main(String[] args) {

        for(int i=0;i<numOrders;i++){

            System.out.println("-------- Pedido " + (i+1) +" --------");
            
            //Instancias de las clases que implementan Runnable
            Cook cook= new Cook("Junior Cook");
            DeliveryPerson deliveryPerson= new DeliveryPerson("Junior delivery worker");

            //Crea los hilos
            Thread threadCook= new Thread(cook);
            Thread threadDeliveryPerson = new Thread(deliveryPerson);

            //El Cocinero comienza la prepación del pedido
            threadCook.start();

            //El hilo main espera a que el cocinero termine
            try{
                threadCook.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            //El repartidor inicia la entrega, una vez el pedido ha sido preparado
            threadDeliveryPerson.start();

            //El hilo main espera a que el repartidor termine
            try{
                threadDeliveryPerson.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
