/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.EmpployeeService;
import com.entity.Employee;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Administrator
 */
@ManagedBean(name = "empCon")
@SessionScoped
public class EmployeeController{
    List<Employee> employeeList = new ArrayList<>();
    String name;
    String userId;
    String password;
    String gender;
    String search;
    
    @PostConstruct
    public void inti() {
        employeeList = empService.getAllEmps();
        System.out.println("---- size "+employeeList.size());
    }
    public List<String> testCompleteMethod(String input) {
        System.out.println("------ "+input);
        List<String> suggesstions = new ArrayList<>();
        for(Employee e: employeeList) {
            if(!e.getName().isEmpty() && e.getName().toLowerCase().contains(input.toLowerCase())) {
                suggesstions.add(e.getId()+"-"+e.getName());
            }
        }
        return suggesstions;
    }
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String login() {
        boolean respose = empService.login(userId, password);
        if(respose) {
            
            return "index";
        }
        return "signUp";
    }
    EmpployeeService empService = new EmpployeeService();
    public String signUp() {
        Employee e = new Employee();
        e.setName(name);
        e.setUserId(userId);
        e.setPassword(password);
        empService.signUp(e);
        return "login";
    }
    public String reset() {
        return "";
    }
    
    
}
