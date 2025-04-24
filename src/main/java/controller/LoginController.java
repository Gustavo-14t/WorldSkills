/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BancoDeDados;
import model.Professor;

/**
 *
 * @author devmat
 */
public class LoginController {
    // Método de autenticação de usuário
     public Professor authenticate(String email, String senha){
     String query = "SELECT * FROM Professor WHERE email = ? and senha = ?";
     try(Connection connection = BancoDeDados.getConection();
     PreparedStatement preparedStatement = connection.prepareStatement(query)){ 
         
             
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, senha);
      
      
      try(ResultSet resultSet = preparedStatement.executeQuery()){
          
       if(resultSet.next()){
          
        int idProfessor = resultSet.getInt("id_professor");
        String nome = resultSet.getString("nome");
       
      

          return new Professor(idProfessor,nome,email,senha);
       }//fim do if
       
      }//fim do try
     } catch(SQLException e){
         System.err.println("Erro ao autenticar o usuário "+ e.getMessage() );
         return null;
     }//fim do catch
        return null;
    }//fim do public
}
