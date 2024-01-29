/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade7_n2;
import models.*;
import interfaces.*;
import java.util.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade7_N2 {
    public static void main(String[] args) {
        Xepa produto1 = new Frutas("Pera", 5.55);
        Xepa produto2 = new Verduras("Alface", 7.0);
        Xepa produto3 = new Frutas("Banana", 6.7);
        Xepa produto4 = new Verduras("Cenoura", 9.0);
        
        Xepa caixa1 = new Caixa("Caixa de Frutas", Arrays.asList(produto1, produto3));
        Xepa caixa2 = new Caixa("Caixa de Verduras", Arrays.asList(produto2, produto4));
        Xepa caixa3 = new Caixa("Caixa Mista", Arrays.asList(produto1, produto2, produto3, produto4));
        
        System.out.println("Composição 1: ");
        caixa1.print(" ");
        System.out.println("Composição 2: ");
        caixa2.print(" ");
        System.out.println("Composição 3: ");
        caixa3.print(" ");
  
    }
}
