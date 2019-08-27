/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean (name = "information")
@RequestScoped
public class info {
   private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String gender;
    private String[] subj;
     
   public info() {
    }

    public String getSchedule() {
        return schedule;
    }

       public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    private String schedule;
   
    

    public String[] getSubj() {
        return subj;
    }

    public void setSubj(String[] subj) {
        this.subj = subj;
    }

   
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
    public String submit(){
        return "result";
    
    }
    
    
}
