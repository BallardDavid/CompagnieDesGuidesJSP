/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stephane
 */
public class dbutils {
    
    static public java.sql.Connection connecter(){
        java.sql.Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            try {
                conn = java.sql.DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/compagnieguides",
                        "root",
                        ""
                );
            } catch (SQLException ex) {
                Logger.getLogger(dbutils.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbutils.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return conn;
    }
    
    static public void deconnecter(java.sql.Connection c){
        if (c != null){
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(dbutils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static public java.sql.ResultSet query(String sql, java.sql.Connection c){
        java.sql.ResultSet rs =  null;
        
        try {
            java.sql.Statement statement = c.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(dbutils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    static public void update(String sql, java.sql.Connection c){
        try {
            java.sql.Statement statement = c.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbutils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}