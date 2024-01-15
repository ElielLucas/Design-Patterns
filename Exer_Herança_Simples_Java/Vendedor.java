/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author eliel.silva
 */
public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public Vendedor(double valorVendas, int qntVendas, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    protected double getValorVendas() {
        return valorVendas;
    }

    protected void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }

    protected int getQtdVendas() {
        return qntVendas;
    }

    protected void setQtdVendas(int qtdVendas){
        this.qntVendas = qtdVendas;
    }

    public String printVendedor(){
        return printEmpregado() + "Valor Vendas: " + valorVendas + "\n" +"Quantidade Vendas: " + qntVendas + "\n";
    }
}
