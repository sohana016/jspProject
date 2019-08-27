/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Emp.Info;

import Com.dao.EmployeeDaoImp;
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
   private String firstName;
   private String lastName;
    private String address;
   private  String mobileNo;
  private  String dateofBirth;
  private  String gender;
  private  String[] subjt;
  private  String schedule;

 
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
   
//   public String submit(){
//       return "";
//   
//   }
       public String submit(){
           EmployeeDaoImp e = new EmployeeDaoImp();
//           Employee em =new Employee();
            Com.entity.Employee em = new Com.entity.Employee();
            em.setEmail("tawhida");
            em.setName("test");
            em.setPhone("545645");
            e.insert(em);
            return "submit";
   
   }
    
       public String logt(){
       return "login.jsp";
   
   }
       
       public void reset(){
           this.firstName="";
           this.lastName="";
           this.address="";
           this.mobileNo="";
           this.dateofBirth="";
           this.gender="";
           this.schedule="";
       
  
   }
}
