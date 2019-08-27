/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Emp.Info;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean (name = "infor")
public class Info {
        String email;
        String password;
        
        
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
  
    return "addInfo ";
    }
    
}
