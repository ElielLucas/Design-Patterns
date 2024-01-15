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
public class Agencia {
    Scanner l = new Scanner(System.in);
    private ContaBancaria [] conta = new ContaBancaria[5];

    public Agencia(){
    }

    public void init(){
        for(int i = 0; i<5; i++){
            conta[i] = new ContaBancaria();

            System.out.println("Digite 1 para depositar ou 2 para retirar da Conta " + (i + 1) + ": ");
            int escolha = l.nextInt();
            System.out.println("Digite o valor: ");

            if(escolha == 1){
                conta[i].depositar(l.nextFloat());
            }else if(escolha == 2){
                conta[i].sacar(l.nextFloat());
            }else{
                 System.out.println("Escolha inválida!");
            }
        }
    }

    public void getSaldos(){
        float saldoTotal = 0;
        System.out.println("Saldos das contas:");
        for(int i = 0; i<5; i++){
            saldoTotal = saldoTotal + conta[i].getSaldo();
            System.out.println("Conta " + (i + 1) + ": " + conta[i].getSaldo());
        }
        System.out.println("Total: " + saldoTotal);
    }
}
