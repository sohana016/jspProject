/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class EmpployeeService {
    
    SessionFactory sessionFac = HibernateUtil.getSessionFactory();
    
    public boolean login(String userId, String password) {
        boolean result = false;
        Session sess = sessionFac.openSession();
        Query query = sess.createQuery("From Employee e where e.userId= :id AND "
                + "e.password = :pass");
        query.setParameter("id", userId);
        query.setParameter("pass", password);
        List<Employee> emps = query.list();
        
        for(Employee e: emps) {
            result = true;
        }
        sess.close();
        return result;
    }
    public List<Employee> getAllEmps() {
        List<Employee> emps = new ArrayList<>();
        Session sess = sessionFac.openSession();
        Query query = sess.createQuery("From Employee");
        emps = query.list();
//        for(Employee e: emps) {
//            emps.add(e);
//        }
        sess.close();
        return emps;
    }
    public void  signUp(Employee emp) {
       boolean result = false;
       Session sess = sessionFac.openSession();
       sess.beginTransaction();
       sess.save(emp);
       sess.getTransaction().commit();
       sess.close();
    }
}
