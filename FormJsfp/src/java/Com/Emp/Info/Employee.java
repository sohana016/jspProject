/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Emp.Info;

/**
 *
 * @author Md Yasin Arif
 */
public class Employee {
      private String name;
    private String address;
   private  String mobileNo;
  private  String dateofBirth;
  private  String gender;
  private  String[] subjt;
  private  String schedule;

    public Employee(String name, String address, String mobileNo, String dateofBirth, String gender, String[] subjt, String schedule) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
        this.subjt = subjt;
        this.schedule = schedule;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
  
   
    
    
}
