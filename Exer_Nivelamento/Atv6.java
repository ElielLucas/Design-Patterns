/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;
import java.util.*;

/**
 *
 * @author eliel.silva
 */
public class Atv6 {
    float valor;

    void ler(){
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o valor a ser investido: ");
        valor = l.nextFloat();
    }

    void exec()
    {
        ler();
        
        if(valor >= 2500)
        {
            System.out.println("Poupança: " + valor*0.005);
            System.out.println("Fundos de renda fixa: " + valor*0.01);
            System.out.println("CDBs: " + valor*0.015);
        }else if(valor<2500 && valor >= 1000)
        {
            System.out.println("Poupança: " + valor*0.005);
            System.out.println("Fundos de renda fixa: " + valor*0.01);
        }else
        {
            System.out.println("Poupança: " + valor*0.005);
        }
    }
    
}
