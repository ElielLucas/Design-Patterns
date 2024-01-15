/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;

/**
 *
 * @author eliel
 */
public class Main {
    public static void main(String[] args) {
        //Todas as contas iniciam com 500 conto 
        Scanner l = new Scanner(System.in);
        Agencia[] VA = new Agencia[2];

        for(int i = 0; i<2; i++){
            System.out.println("Operações da Agencia " + (i + 1));
            VA[i] = new Agencia();
            VA[i].init();
           System.out.println("\n\n");
        }

        for(int i = 0; i<2; i++){
            System.out.println("Saldo da Agencia " + (i + 1));
            VA[i].getSaldos();
        }  
    }
}
