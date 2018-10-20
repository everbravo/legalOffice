package LegalOffice.v1.model;

import java.io.Serializable;


public class loginModel implements Serializable{
   private String users; 
   private String password; 

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   boolean inicios = false;
    public boolean iniciar(){
        
        if (users.equals("ever")&& password.equals("123admin")) {
            this.inicios = true;
        }else{
            this.inicios=false;
        }
        return inicios;
    }
}
