package DAO;

import ENTIDADES.Aluno;
import java.util.ArrayList; // Importa a classe para inicializar a lista
import java.util.List; // Importa a interface List
import java.sql.SQLException;
import java.sql.ResultSet;

public class AlunoDAO extends ConexãoDAO {
    
    // Método para adicionar aluno
    public Integer addAluno(Aluno Aluno) throws SQLException
    {
        
        String query = "INSERT INTO Alunos(nome_completo,serie,data_saida,hora,quem_autorizou,saiu_com_quem,motivo ) VALUES (?,?,?,?,?,?,?)";
        
        
        executeComand(query, Aluno.getNome_completo(), Aluno.getSerie(), Aluno.getData_saida(), Aluno.getHora(), Aluno.getQuem_autorizou(), Aluno.getSaiu_com_quem(), Aluno.getMotivo());     
        
        return Aluno.getId();
    }
    
    
    public List<Aluno> getAllAlunos() throws SQLException {
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
      
        try (ResultSet rs = executeQuery("SELECT * FROM Alunos")) {
            
            while(rs.next()) {
                Aluno a = new Aluno();
                
               
                a.setId(rs.getInt("id")); 
                a.setNome_completo(rs.getString("nome_completo"));
                a.setSerie(rs.getString("serie"));
                a.setData_saida(rs.getString("data_saida"));
                a.setHora(rs.getString("hora"));
                a.setQuem_autorizou(rs.getString("quem_autorizou"));
                a.setSaiu_com_quem(rs.getString("saiu_com_quem"));
                a.setMotivo(rs.getString("motivo"));

                listaAlunos.add(a);
            }
            
        } 
        
        return listaAlunos;
    } 
    
} 