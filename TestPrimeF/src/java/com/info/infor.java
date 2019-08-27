/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean(name ="information")
@SessionScoped
public class infor {
    int id;
    String firstName;
    String lastName;
    Date dateofBirth;
    String[] qualification;
    String gender;
    String usseId;
    String password;
    String schedule;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    
    

    public infor() {
    }

    public String getUsseId() {
        return usseId;
    }

    public void setUsseId(String usseId) {
        this.usseId = usseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String[] getQualification() {
        return qualification;
    }

    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }
         public List<String> genders(String input){
      ArrayList<String> genders = new ArrayList<>();
       
      genders.add("Male");
      genders.add("Female");

     return genders;
     }
    public String submit(){
        return "result.xhtml";
    
    }
    public String logIn(){
        return "signUp.xhtml";
    
    }
    public void reset(){
        this.firstName="";
        this.lastName="";
       this.gender="";
    
    }
    public void logRe(){
       this.usseId="";
       this.password="";
    
    }
    public String back(){
    
    return"logIn.xhtml";
           }
    
    
}
