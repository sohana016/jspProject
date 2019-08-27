/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.flight;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrator
 */
@ManagedBean (name = "types")
@NoneScoped
public class FlightTypes {
     SelectItem[] tripTypes = new SelectItem[] {
        new SelectItem("Roundtrip","Roundtrip"),
        new SelectItem("One Way","One Way"),
    };

    public   SelectItem[] getTripTypes() {
        return tripTypes;
    }

    public   void setTripTypes(SelectItem[] tripTypes) {
        this.tripTypes = tripTypes;
    }
    
    
}
