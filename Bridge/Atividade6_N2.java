/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade6_n2;
import models.*;
import interfaces.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade6_N2 {

    public static void main(String[] args) {
        Recheio carne = new Carne();
        Recheio frango = new Frango();
        Recheio queijo = new Queijo();
        
        Salgado salgado1 = new Coxinha(carne);
        Salgado salgado2 = new Coxinha(frango);
        Salgado salgado3 = new Coxinha(queijo);
        
        System.out.println("Salgado 1: " + salgado1.produzirSalgado());
        System.out.println("Salgado 2: " + salgado2.produzirSalgado());
        System.out.println("Salgado 3: " + salgado3.produzirSalgado());
        
        Salgado salgado4 = new Pastel(carne);
        Salgado salgado5 = new Pastel(frango);
        Salgado salgado6 = new Pastel(queijo);
        
        System.out.println("Salgado 4: " + salgado4.produzirSalgado());
        System.out.println("Salgado 5: " + salgado5.produzirSalgado());
        System.out.println("Salgado 6: " + salgado6.produzirSalgado());
        
        Salgado salgado7 = new Esfirra(carne);
        Salgado salgado8 = new Esfirra(frango);
        Salgado salgado9 = new Esfirra(queijo);
        
        System.out.println("Salgado 7: " + salgado7.produzirSalgado());
        System.out.println("Salgado 8: " + salgado8.produzirSalgado());
        System.out.println("Salgado 9: " + salgado9.produzirSalgado());
    }
}
