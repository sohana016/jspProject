/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.ProductDao;
import com.model.Product;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Administrator
 */
@ManagedBean(name = "productController")
@RequestScoped
public class ProductController {
    String name;
    int id;
    int qty;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    
    
    
    
    ProductDao dao = new ProductDao();
    
    
    @PostConstruct
    public void init() {
//        dao.insert();
//        List<Product> products = dao.getproducts();
//        System.out.println("Product 1"+products.get(0).getName());
//        setName(products.get(0).getName());


        Product p = dao.getProductById(2);
        setName(p.getName());
    }
    
    public List<Product> productList() {
        List<Product> products = dao.getproducts();
        return products;
    }
    
    public String addProductUrl() {
        return "addProduct";
    }
    public String addProduct() {
        dao.insert(new Product(name, qty, price));
        return "index";
    }
    public String back() {
        return "index";
    }
}
