/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author eliel.silva
 */
public class Gerente extends Empregado {
    private String nomeGerencia;

    public Gerente(String nomeGerencia, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.nomeGerencia = nomeGerencia;
    }

    protected String getNomeGerencia() {
        return nomeGerencia;
    }

    protected void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }

    public String printGerente(){
        return printEmpregado() + "Nome Gerencia: " + nomeGerencia + "\n";
    }
}
