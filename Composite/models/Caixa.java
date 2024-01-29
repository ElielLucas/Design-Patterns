/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.*;
import java.util.*;
/**
 *
 * @author eliel.silva
 */
public class Caixa implements Xepa{
    private String name;
    private List<Xepa> childs;

    public Caixa(String name, List<Xepa> childs) {
        this.name = name;
        this.childs = childs;
    }
    
    @Override
    public double getValor()
    {
        double saida = 0;
        for(Xepa child: childs) {
            saida += child.getValor();
        }
        return saida;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name +": [Valor: R$"+getValor()+"]");
        for(Xepa child: childs) {
            child.print(structure + "|-----");
        }
    } 
}
