/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author devmat
 */
public class atividade {
    int id_atividade;
    String nome;
    String descricao;

    public atividade(int id_atividade, String nome, String descricao) {
        this.id_atividade = id_atividade;
        this.nome = nome;
        this.descricao = descricao;
    }

    public atividade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public atividade() {
    }

    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
