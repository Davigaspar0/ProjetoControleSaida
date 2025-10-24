/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTIDADES.Administrador;
import java.sql.ResultSet;
import java.sql.SQLException;


    
    public class AdministradorDAO extends ConexãoDAO {
        
        public Integer LoginAdm(Administrador Administrador) throws SQLException {
            
             String query = "SELECT * FROM Administrador WHERE nome = ? and senha = ?";
             ResultSet rs = executeQuery(query,  Administrador.getNome(), Administrador.getSenha());
            
             if(rs.next()){
            return Administrador.getId();
                    
          }else{
        return null;
    }   
            
        
        }
}
