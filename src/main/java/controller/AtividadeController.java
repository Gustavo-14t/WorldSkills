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
import model.atividade;

/**
 *
 * @author devmat
 */
public class AtividadeController {
    public boolean cadastroAtividade( atividade atividade){
     //criuando uma String que recebe uma comando SQL
     String query = "INSERT INTO Atividade ( nome,descricao) values (?,?) ";
     
     try(Connection conection = BancoDeDados.getConection();
        PreparedStatement preparedStatement =
                conection.prepareStatement(query)){       
            
            // mandar os dados para dentro do insert
            preparedStatement.setString(1,atividade.getNome());
            preparedStatement.setString(2,atividade.getDescricao());
            
           
           
            
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
    public List<atividade> listarUsuario(){
        List<atividade> lista = new ArrayList<>();
        
        String query = "SELECT * FROM Atividades ;";

        try(Connection connection = BancoDeDados.getConection();//conexão com o banco de dados
     PreparedStatement preparedStatement = connection.prepareStatement(query)){
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                atividade att = new atividade();
                
               
                att.setNome(resultSet.getString("numero"));
                att.setDescricao(resultSet.getString("descricao"));
                
               
                
                
                lista.add(att);

            }//fim do while
          
             return lista;
            
        }catch(SQLException e){
         System.err.println("Erro listar o usuário "+ e );
         return null;
        }//fim do try
        
    }//fim do método listarClientes()
}
