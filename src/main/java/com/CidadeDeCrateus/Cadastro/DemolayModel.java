package com.CidadeDeCrateus.Cadastro;

import jakarta.persistence.*;

//Entity transforma a classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class DemolayModel {

    //Proximo atributo é o ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String identidade;
    private int idade;

    public DemolayModel(){

    }

    public DemolayModel(String nome, String identidade, int idade){
        this.nome = nome;
        this.identidade = identidade;
        this.idade = idade;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIdentidade(){
        return identidade;
    }

    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
