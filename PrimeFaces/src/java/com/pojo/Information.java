/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean
@SessionScoped
public class Information {
    private List<payRoll> pay;

    public Information() {
    }
    
    


    public List<payRoll> getPay() {
        return pay;
    }

    public void setPay(List<payRoll> pay) {
        this.pay = pay;
    }
    
    
    
}
