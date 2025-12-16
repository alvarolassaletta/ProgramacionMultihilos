package Ejercicio18;

public class Email {
    private String emailAddress;

    public Email(String emailAddress){
        this.emailAddress = emailAddress.trim();
    }

    /**Método para validar el email.
     *  Para el nombre de usuario se permiten  mayúsculas, minúsculas, números y los caracteres  -._
     *  Para el dominio se permiten  mayúsculas, minúsculas y números y el caracter .
     *  No puede contener texto, ni antes, ni después
     *
     *  @return Boolean devuelve true o false en función de si el concreto email se ajusta
     *  a la  expresión regular */

    public  boolean validateEmail(){
        if(emailAddress==null || emailAddress.isEmpty()){
            return false;
        }
        String regex = "^[A-Za-z0-9-_.]+@[A-Za-z0-9.]+$";

        return this.emailAddress.matches(regex);
    }


    public  String getEmailAddress(){
        return this.emailAddress;
    }

    @Override
    public String toString() {
        return this.emailAddress;
    }
}
