/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Product;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Administrator
 */
public class ProductDao {
    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    public List<Product> getproducts() {
        List<Product> lists = new ArrayList<>();
        Session sess= sessionFactory.openSession();
        Query query= sess.createQuery("From Product");
        lists = query.list();
//           Criteria criteria = sess.createCriteria(Product.class);
//          lists=criteria.list();
        return lists;
    }
    public Product getProductById(int id) {
        Product p = new Product();
        Session sess= sessionFactory.openSession();
        Query query= sess.createQuery("From Product p where p.id= :productId");
        query.setParameter("productId", id);
        for (Object p1: query.list()) {
            p = (Product) p1;
        }
        return p;
    }
    public void insert(Product p) {
        Session sess= sessionFactory.openSession();
        sess.beginTransaction();
        sess.save(p);
        sess.getTransaction().commit();
        sess.close();
        
    }
    
    

    
}
