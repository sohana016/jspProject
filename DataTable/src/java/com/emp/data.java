/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp;

import com.info.Informations;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author A D M I N
 */
@ManagedBean(name ="em")
//@SessionScoped
@ViewScoped
public class data {
    List<Informations> inform = new ArrayList<>();

    
 @PostConstruct
//    public void init(){
////         List<Informations> informs = new ArrayList<>();
//        for(int i=0;i<20;i++){
//            inform.add(new Informations(i,"Name"+i,"tawhida@gmail","01654266","Dhaka"));
//        
//        }
////    setInform(informs);
//    
//    }
 public void init(){
     inform.add(new Informations(1,"mim","ggdhj","54564","Dhaka"));
     inform.add(new Informations(2,"tawhida","dfgdfg","6756","Dhaka"));
     inform.add(new Informations(3,"ety","gdfgdg","767","Dhaka"));
     inform.add(new Informations(4,"pinky","gjfghdfgd","4664564","Dhaka"));
     inform.add(new Informations(5,"rabeya","mjhgjfh","7567567","Dhaka"));
     inform.add(new Informations(6,"trishna","strery","765757","Dhaka"));
     inform.add(new Informations(7,"tondra","jjyh","463657","Dhaka"));
     inform.add(new Informations(8,"rimu","rtytr","54598764","Dhaka"));
     
     
     
 
 }


    public List<Informations> getInform() {
        return inform;
    }

    public void setInform(List<Informations> inform) {
        this.inform = inform;
    }
    
    
    
    
    
}
