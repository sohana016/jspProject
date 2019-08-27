/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tawhida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            //Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
   public boolean login(){
       boolean result = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee", "root", "root");
            Statement stm = con.createStatement();
            ResultSet r = stm.executeQuery("select id=1,password=123 from user");
            
                    } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
   return result;
   }
    
}
