/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author devmat
 */
public class turma {
    int id_turma;
    int id_professor;
    int id_atividade;
    String nome;
    String descricao;

    public turma(int id_turma, int id_professor, int id_atividade, String nome, String descricao) {
        this.id_turma = id_turma;
        this.id_professor = id_professor;
        this.id_atividade = id_atividade;
        this.nome = nome;
        this.descricao = descricao;
    }

    public turma(int id_professor, int id_atividade, String nome, String descricao) {
        this.id_professor = id_professor;
        this.id_atividade = id_atividade;
        this.nome = nome;
        this.descricao = descricao;
    }

    public turma() {
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
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
