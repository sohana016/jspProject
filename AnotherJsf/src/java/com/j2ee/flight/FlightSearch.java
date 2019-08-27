/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.flight;

import com.j2ee.model.Flight;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Administrator
 */
@ManagedBean(name = "flight")
@SessionScoped
public class FlightSearch {
    private String origination;
    private String destination;
    private Date departDate;
    private String departTime;
    private Date returnDate;
    private String returnTime;
    private String tripTypes;


    ArrayList<String> list = new ArrayList <>();
    
    public FlightSearch() {
        matchingFlight.add(new Flight());
        matchingFlight.add(new Flight());
    }
    
    ArrayList<Flight> matchingFlight=new ArrayList<>();
    public String getTripTypes() {
        return tripTypes;
    }

    public void setTripTypes(String tripTypes) {
        this.tripTypes = tripTypes;
    }
    
    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
//        matchingFlight.get(0).setDepartDate(departDate);
//        matchingFlight.get(1).setDepartDate(departDate);
        
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
        
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
    public String submit() {
        Flight f1 = matchingFlight.get(0);
        f1.setDepartDate(departDate);
        f1.setDepartTime(departTime);
        f1.setDestination(destination);
        f1.setFlightNum("001");
        f1.setReturnDate(returnDate);
        f1.setReturnTime(returnTime);

        Flight f2 = matchingFlight.get(1);
        f2.setDepartDate(departDate);
        f2.setDepartTime(departTime);
        f2.setDestination(destination);
        f2.setFlightNum("002");
        f2.setReturnDate(returnDate);
        f2.setReturnTime(returnTime);
        return "searchResult";
    }
    public void originationChanged(ValueChangeEvent event) {
        
        if("bn".equals(event.getNewValue().toString())){
            System.out.println("-----------"+event.getNewValue().toString());
            FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("bn"));
        } else if ("en".equals(event.getNewValue().toString())) {
            System.out.println("-----------"+event.getNewValue().toString());
            FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en"));
        }
//        if(event.getNewValue()!= null) {
//            setDestination(event.getNewValue().toString());
//        }
        
        FacesContext.getCurrentInstance().renderResponse();
    }

    public ArrayList<Flight> getMatchingFlight() {
        return matchingFlight;
    }

    public void setMatchingFlight(ArrayList<Flight> matchingFlight) {
        this.matchingFlight = matchingFlight;
    }
    
    
    
}
