/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prime;

import com.employee.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author A D M I N
 */
@ManagedBean (name="db")
@SessionScoped
public class DataTable {
    List<Employee> emps = new ArrayList<>();
    
    @PostConstruct
    public void init(){
    List<Employee> ems = new ArrayList<>();
    for(int i=0;i < 10;i++){
    ems.add(new Employee(i,"Name"+i,"j2ee",1000));
    }
    setEmps(ems);
    }
    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }
    
    
    
}
