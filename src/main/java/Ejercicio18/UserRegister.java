package Ejercicio18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aqui  se  planteaba el problema de  no poder añadir el usuario  en el método run
 * Si hubiera implementado Runnable en este clase se planteaba la imposibilidad
 *  de crear la instancia de user aqui  al añadir el usuario en el método run
 * Para eso  se crea  la clase  Register task.
 *  */

public class UserRegister  {
    private List<User> userList;

    public UserRegister(){
        userList= Collections.synchronizedList(new ArrayList<>());
    }

    public  void addUser (User user ){
        userList.add(user);
        System.out.println("Usuario registrado: " + user.toString());
    }

    public  List <User> getUserList(){
        return userList;
    }
}
