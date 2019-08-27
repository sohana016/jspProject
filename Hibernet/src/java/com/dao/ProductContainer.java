/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.model.Product;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author A D M I N
 */
@ManagedBean(name = "products")
@RequestScoped
public class ProductContainer {
    String name;
    int qty;
    double price;
    ProductDao dao = new ProductDao ();

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductDao getDao() {
        return dao;
    }

    public void setDao(ProductDao dao) {
        this.dao = dao;
    }
    

    @PostConstruct
    public void init(){
//    dao.insert();


    }
    public List<Product> productList(){
        List<Product> products = dao.getproducts();
        return products;
    }
    public String addProductUrl(){
        return "addProduct";
    
    }
    public String addProduct(){
        
       dao.insert(new Product(name, qty, price));
        return "index";
    
    }
    public String back(){
        return "index";
    }
    
}
