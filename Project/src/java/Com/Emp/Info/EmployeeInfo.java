/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Emp.Info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean (name = "employee")
@SessionScoped
public class EmployeeInfo {
   private String name;
    private String address;
   private  String mobileNo;
  private  String dateofBirth;
  private  String gender;
  private  String[] subjt;
  private  String schedule;

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
  private List<Employee> emp;
  

    public String[] getSubjt() {
        return subjt;
    }

    public void setSubjt(String[] subjt) {
        this.subjt = subjt;
    }

  
   

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
  

    public EmployeeInfo() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    
    
    
           
                  
   public String submit(){
       return "information";
   
   }
    
    
    
}
