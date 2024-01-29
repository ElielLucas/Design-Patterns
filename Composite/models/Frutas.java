/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author eliel.silva
 */
public class Frutas extends Produto{

    public Frutas(String nome, double valor) {
        super(nome, valor);
    }
   
    @Override
    public void print(String structure) {
        System.out.println(structure + "Produto = " + super.getNome() + ". [Valor: R$"+super.getValor()+"]");
    }
}
