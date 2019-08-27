/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Flight.Deser;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author A D M I N
 */
@ManagedBean (name="times")
@NoneScoped
public class FlightTime {
    SelectItem[] times = new SelectItem[]{
    new SelectItem("Anytime","Anytime"),
    new SelectItem("Morning","Morning"),
    new SelectItem("Afternoon","Afternoon"),
    new SelectItem("Evening","Evening")
        
    };

    public SelectItem[] getTimes() {
        return times;
    }

    public void setTimes(SelectItem[] times) {
        this.times = times;
    }
    
    
}
