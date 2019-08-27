/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Emp.Info;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name = "infor")
@SessionScoped
public class Info {
     private String email;
      private String password;
                
          public Info() {
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
        public String search(){
            if(email != null && email.equals("t") || password != null && password.equals("12")){
             return "addInfo ";
            }
        return "addInfo ";
    }
    
}
