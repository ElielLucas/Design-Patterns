/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.*;
/**
 *
 * @author eliel.silva
 */
public abstract class Produto implements Xepa{
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public abstract void print(String structure);

    public String getNome() {
        return nome;
    }
    
    @Override
    public double getValor() {
        return valor;
    }
    
    
}
