/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author A D M I N
 */
@ManagedBean (name ="emp")
@SessionScoped
public class EmpInfo {
    int id;
    String name;
    Date dob;
    String password;
    Role role = new Role();
    Department dept = new Department();
     String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   
    
    public List<String> roles(){
        List<String> roles = new ArrayList<>();
    for(int i =0; i< 4;i++){
        roles.add(i+"");
    
    }
    return roles;
    }
    
       public List<String> depts(){
        List<String> depts = new ArrayList<>();
    for(int i =0; i< 4;i++){
        depts.add(i+"");
    
    }
    return depts;
    }
    
}
