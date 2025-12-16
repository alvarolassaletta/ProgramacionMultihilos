package Ejercicio18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryTask implements Runnable {
    private User user;

    public DirectoryTask(User user){
        this.user= user;
    }

    @Override
    public void run(){
        try{
            Path path = Paths.get("src/data/user" + user.getId());
            if(!Files.exists(path)){
                Files.createDirectories(path);
                System.out.println("Directorio creado: " + path.toAbsolutePath());
            } else{
                System.out.println("No se pudo crear el directorio ");
            }
            Thread.sleep(1000);

        } catch (IOException  | InterruptedException e){
            e.printStackTrace();
        }
    }
}
