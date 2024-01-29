/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade8_n2;
import model.*;
import composite.*;
import interfaces.*;
import fabricas.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade8_N2 {

    public static void main(String[] args) {     
        CaixaCafeManha caixa1 = new CaixaCafeManha("Salgados");
        caixa1.addProduto((Produto)SalgadoFactory.assarSalgado("coxinha"));
        caixa1.addProduto((Produto)SalgadoFactory.assarSalgado("quibe"));
        caixa1.addProduto((Produto)SalgadoFactory.assarSalgado("esfirra"));
        
        System.out.println("Caixa 1: " + caixa1.getTipo());
        caixa1.listar();
        
        System.out.println("\n");
        
        CaixaCafeManha caixa2 = new CaixaCafeManha("Doces");
        caixa2.addProduto((Produto)DoceFactory.fazerDoce("bolo"));
        caixa2.addProduto((Produto)DoceFactory.fazerDoce("brigadeiro"));
        caixa2.addProduto((Produto)DoceFactory.fazerDoce("sorvete"));
        
        System.out.println("Caixa 2: " + caixa2.getTipo());
        caixa2.listar();
        
        System.out.println("\n");
        
  
        CaixaCafeManha caixa3 = new CaixaCafeManha("Mista");
        caixa3.addProduto((Produto)DoceFactory.fazerDoce("brigadeiro"));
        caixa3.addProduto((Produto)SalgadoFactory.assarSalgado("esfirra"));
        caixa3.addProduto((Produto)DoceFactory.fazerDoce("bolo"));
        
        System.out.println("Caixa 3: " + caixa3.getTipo());
        caixa3.listar();
        
        System.out.println("\n");
        
        CaixaCafeManha caixa4 = new CaixaCafeManha("Mista");
        caixa4.addProduto(caixa2);
        caixa4.addProduto(caixa3);
        caixa4.addProduto(caixa1);
        
        System.out.println("Caixa 4: " + caixa4.getTipo());
        caixa4.listar();
        
        System.out.println("\n");
    }
}
