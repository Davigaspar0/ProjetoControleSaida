/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davio
 */
public class ConexãoDAO {

    /**
     * @param args the command line arguments
     */       
         public static void main(String[] args) {
    System.out.println("Funcionando!");
    }   
   
    public Connection getConnection() {
      try {
            Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Banco_Liceu", "root", "");
            jdbc:mysql://localhost:3306/Banco_Liceu

           
            return cn;
       
        } catch (SQLException ex) {
            Logger.getLogger(ConexãoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
           
        // Query normal
    public Statement getStatement() throws SQLException {
        return getConnection().createStatement();
    } // fim getStatement
    
    // Query pré-compilada
    public PreparedStatement getprePreparedStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    } // fim getprePreparedStatement
    
    public ResultSet executeQuery(String query,Object... params) throws SQLException {
        PreparedStatement ps = getprePreparedStatement(query);
        
        for (int i=0; i <params.length; i++) {
            ps.setObject(1+i, params[i]);
        }
        return ps.executeQuery();    
    }
    // método que executa INSERT, DELETE e UPDATES no BD
    public int executeComand(String query,Object... params) throws SQLException {
        int result;
        try (PreparedStatement ps = getprePreparedStatement(query)) {
            for (int i=0; i <params.length; i++) {
                ps.setObject(1+i, params[i]);
            }   result = ps.executeUpdate();
        }
        return result;
    } // fim do executeComand
      
       }





