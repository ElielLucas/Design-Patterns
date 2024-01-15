/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author eliel.silva
 */
public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascim;

    public Cliente(double valorDivida, int anoNascim, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    protected String getValorDivida() {
        return valorDivida;
    }

    protected void setValorDivida(String valorDivida){
        this.valorDivida = valorDivida;
    }

    protected String getAnoNascim() {
        return anoNascim;
    }

    protected void setAnoNascim(String anoNascim) {
        this.anoNascim = anoNascim;
    }

    public String printCliente(){
        return printPessoa() + "Valor Divida: " + valorDivida + "\n" + "Ano Nascimento: " + anoNascim + "\n";
    }
}
