/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class UserRepository {

    public UserRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
//    public boolean login(){
//        Connection con = DriverManager.getConnection("jdbc", string1, string2)
//    
//    }
    
}
