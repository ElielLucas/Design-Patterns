/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author japa
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected int getSexo() {
        return sexo;
    }

    public String printPessoa(){
        return "Nome: " + nome + "\n" + "Idade: " + idade +"\n" + "Sexo: " + sexo +"\n";
    }
    
    
    
}
