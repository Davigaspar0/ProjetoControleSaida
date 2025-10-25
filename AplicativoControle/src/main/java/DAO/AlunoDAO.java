/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTIDADES.Aluno;
import java.sql.SQLException;


public class AlunoDAO extends ConexãoDAO {
    
    public Integer addAluno(Aluno Aluno) throws SQLException
    {
        String query = "INSERT INTO Alunos(nome_completo,serie,data_saida,hora,quem_autorizou,saiu_com_quem,motivo ) VALUES (?,?,?,?,?,?,?)";
        executeComand(query,  Aluno.getNome_completo(), Aluno.getSerie(), Aluno.getData_saida(), Aluno.getHora(), Aluno.getQuem_autorizou(), Aluno.getSaiu_com_quem(), Aluno.getMotivo());       
        return Aluno.getId();
    
    
    
    }
    
    
}
