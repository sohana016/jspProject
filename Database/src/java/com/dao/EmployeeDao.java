/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Employee;
import java.util.List;

/**
 *
 * @author A D M I N
 */
public interface EmployeeDao {
     public void insert(Employee em);
     public void update(Employee em, int id);
    public Employee getEmpById(int id);
    public List<Employee> getEmps();
}
