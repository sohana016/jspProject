/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

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
public class ProductDao {
//    SessionFactory sessionFacttory = HibernateUtil.getSessionFactory();
//    public List<Product> getproducts(){
//        List<Product> lists= new ArrayList<>();
//        Session sess = sessionFacttory.openSession();
//       
//            return lists;
    
         SessionFactory sessionFacttory = HibernateUtil.getSessionFactory();
          public List<Product> getproducts(){
               List<Product> lists= new ArrayList<>();
               Session sess = sessionFacttory.openSession();
               Query query = sess.createQuery("From Product");
                lists = query.list();
           return lists;
          }
          
          public Product getProductById(int id){
              
          Product p = new Product();
          
          Session sess = sessionFacttory.openSession();
          Query query = sess.createQuery("From Product p where p.id = :productId");
          query.setParameter("productId", id);
          for(Object p1: query.list()){
              p=(Product) p1;
             
          
          }
           return p;
          }
    
//    public void insert(){
//        
//        Session sess = sessionFacttory.openSession();
//        sess.beginTransaction();
//        
//       Product p = new Product("test",5,100.0);
//        sess.save(p);
//        sess.getTransaction().commit();
//        sess.close();
//    
//    }
              public void insert(Product p){
        
        Session sess = sessionFacttory.openSession();
        sess.beginTransaction();
        
      
        sess.save(p);
        sess.getTransaction().commit();
        sess.close();
    
    }

}
    

