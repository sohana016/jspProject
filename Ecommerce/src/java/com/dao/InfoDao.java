/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Info;
import com.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author A D M I N
 */
public class InfoDao {
     SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    public List<Info> getinfo() {
        List<Info> lists = new ArrayList<>();
        Session sess= sessionFactory.openSession();
        Query query= sess.createQuery("From Info");
        lists = query.list();
        return lists;
    }
//        public Info getInfoById(int id){
//        Info in =new Info();
//        Session sess = sessionFactory.openSession();
//        Query query = sess.createQuery("From Info in where in.id = :infoId");
//        
//        query.setParameter("infoId", id);
//        for(Object in1 : query.list()){
//            in = (Info) in1;
//        
//        }
//        return in;
//        }
    
    
    

     public void insert(Info I) {
        Session sess= sessionFactory.openSession();
        sess.beginTransaction();
        sess.save(I);
        sess.getTransaction().commit();
        sess.close();
        
    }
}
