package Ejercicio12Beta;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Download download1= new Download("Windows-Server.rdp");
        Download download2= new Download("Docker Desktop Installer.exe");
        Download download3= new Download("dbeaver-ce-25.2.5-x86_64-setup.exe");

        Thread thread1 = new Thread(download1);
        Thread thread2 = new Thread(download2);
        Thread thread3 = new Thread(download3);

        thread1.start();
        thread2.start();
        thread3.start();

        try{

            thread1.join();
            thread2.join();
            thread3.join();

        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Descargas finalizadas. El hilo main continúa");

    }
}
