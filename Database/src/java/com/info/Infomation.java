/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import com.dao.EmployeeDaoImp;
import com.entity.Employee;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author A D M I N
 */
@ManagedBean (name = "st")
public class Infomation {
    int id;
    String name;
    
    String email;
    String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Infomation() {
    }
   
    public String submit(){
    EmployeeDaoImp e = new EmployeeDaoImp();
//           Employee em =new Employee();
           Employee em = new Employee();
            em.setEmail("tawhida");
            em.setName("test");
            em.setPhone("908766");
            e.insert(em);
            return "submit";
    
    }
    
}
