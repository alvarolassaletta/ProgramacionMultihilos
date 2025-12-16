package Ejercicio18;


public class User  {
    private static int counter=1;
    private int id;
    private String name;
    private String lastname;
    private Email email;


    //el Email lo establecemos  en la clase EmailTask una vez se haya validado
    // el email
    public User(String name, String  lastname){
        synchronized (User.class){
            this.id= counter;
            counter++;
        }
        this.name = name;
        this.lastname= lastname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Email getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(Email email) {
        this.email =  email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email=" + email +
                '}';
    }
}


