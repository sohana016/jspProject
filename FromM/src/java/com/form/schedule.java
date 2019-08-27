/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean(name ="times")
@RequestScoped
public class schedule {
        SelectItem[] sch = new  SelectItem[]{
        new SelectItem ("Morning","Morning"),
        new SelectItem ("Evening","Evening"),
        
        };
    
    public schedule() {
    }

    public SelectItem[] getSch() {
        return sch;
    }

    public void setSch(SelectItem[] sch) {
        this.sch = sch;
    }
    
    
    
    
}
