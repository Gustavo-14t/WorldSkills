/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordskill;


import java.sql.Connection;
import static model.BancoDeDados.getConection;
import view.Loginn;

/**
 *
 * @author devmat
 */
public class WordSkill {

    public static void main(String[] args) {
/*         Connection conexao = getConection();
        if (conexao != null){
             System.out.println("Deu bom");
        }else{
            System.out.println("Deu ruim");
        }
        */
        Loginn login = new Loginn ();
        login.setVisible(true);
    }
}
