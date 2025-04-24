/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BancoDeDados;
import model.turma;
import model.turma;


/**
 *
 * @author devmat
 */
public class TurmaController {
    public boolean cadastroUsuario( turma turma){
     //criuando uma String que recebe uma comando SQL
     String query = "INSERT INTO Turma ( id_Professor,nome,descricao) values (?,?,?) ";
     
     try(Connection conection = BancoDeDados.getConection();
        PreparedStatement preparedStatement =
                conection.prepareStatement(query)){       
            
            // mandar os dados para dentro do insert
            preparedStatement.setInt(1,turma.getId_professor());
            preparedStatement.setString(2,turma.getNome());
                preparedStatement.setString(3,turma.getDescricao());
             
           
           
            
            /*try(ResultSet resultSet = preparedStatement.executeQuery()){
                return resultSet.next();
            }// final do segundo try*/
            // verifica se o insert foi executado
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
            
        }catch(SQLException e){
            // imprimindo erro que deu ao inserir usuário
            System.err.print("Erro ao Inserir Dados!" + e);
            return false;
        }// final do try catch
    
}// fim do método cadastroTurno()
    
    public List<turma> listarUsuario(){
        List<turma> lista = new ArrayList<>();
        
        String query = "SELECT nome_turma,numero FROM Turma ;";

        try(Connection connection = BancoDeDados.getConection();//conexão com o banco de dados
     PreparedStatement preparedStatement = connection.prepareStatement(query)){
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                turma turma = new turma();
                
                turma.setNome(resultSet.getString("nome_turma"));
                turma.setDescricao(resultSet.getString("numero"));
                
               
                
                
                lista.add(turma);

            }//fim do while
          
             return lista;
            
        }catch(SQLException e){
         System.err.println("Erro listar o usuário "+ e );
         return null;
        }//fim do try
        
    }//fim do método listarClientes()
}
