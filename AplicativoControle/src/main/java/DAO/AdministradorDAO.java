package DAO;


import ENTIDADES.Administrador;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt; // Import da biblioteca BCrypt

public class AdministradorDAO extends ConexãoDAO {

    public Integer LoginAdm(Administrador Administrador) throws SQLException {
        
        
        String query = "SELECT id, senha FROM Administrador WHERE nome = ?";
        
        
        try (ResultSet rs = executeQuery(query, Administrador.getNome())) {
            
            if (rs.next()) {
                
                String hashArmazenado = rs.getString("senha"); 
                Integer idUsuario = rs.getInt("id");
                
                String senhaDigitada = Administrador.getSenha(); // Senha em texto puro
                
                
                if (BCrypt.checkpw(senhaDigitada, hashArmazenado)) {
                    
                    
                    return idUsuario;
                    
                } else {
                    
                    return null;
                }
                
            } else {
                
                return null;
            }
        }
    }
}