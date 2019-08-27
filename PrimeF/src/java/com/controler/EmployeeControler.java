/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author A D M I N
 */
@ManagedBean(name="con")
public class EmployeeControler {
    
    int id;
    
         String gender;  
    String theme ="afterdark";
    boolean male;
    boolean female;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }
    

    public EmployeeControler() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

  
    
    
    
     public void multiple(){
            this.id =5*5;
     
     }
     
     public void changeTheme(){
         theme="bluesky";
     
     }
     public List<String> genders(String input){
      ArrayList<String> genders = new ArrayList<>();
      genders.add("Male");
      genders.add("Female");
     return genders;
     }
          public List<String> item(String input){
      ArrayList<String> item = new ArrayList<>();
     List<String> matchItm = new ArrayList<>();
            item.add("01717");
            item.add("01617");
            item.add("01517");
            item.add("01917");
            item.add("01817");
            for(String num :item){
            if(num.contains(input)){
                matchItm.add(num);
            }
            }
     return matchItm;
     }
          public void onDateSelect(SelectEvent event){
              FacesContext facesContext = FacesContext.getCurrentInstance();
              Date value = (Date) event.getObject();
          facesContext.addMessage(null, new FacesMessage(value.toString()));
          }
     
}
