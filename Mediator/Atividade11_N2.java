/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade11_n2;
import Mediator.*;
import models.*;
import interfaces.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Eliel
 */
public class Atividade11_N2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Mediator mediador = new MediatorImplementacao();
        
        mediador.criaFilaCheque(new Cheque(mediador));
        mediador.criaFilaDeposito(new Deposito(mediador));
        mediador.criaFilaPoupanca(new Poupanca(mediador));
        mediador.criaFilaSaque(new Saque(mediador));
        
        int op = -1;
        int count = 11;
        while(op != 0)
        {
            System.out.println("======Selecione o Servico======");
            System.out.println("-  1: Poupanca                -");
            System.out.println("-  2: Saque                   -");
            System.out.println("-  3: Cheque                  -");
            System.out.println("-  4: Deposito                -");
            System.out.println("\n");
            System.out.println("-  0: Sair                    -");
            System.out.println("===============================");
            System.out.println("Opcao: ");
            
            op = ler.nextInt();
            
            if(op !=0)
            {
                mediador.controlaFila(op, count);
                count += 1;
            }                                    
        }
        
        mediador.printt();
        
        op = -1;
        
        
//Isso de selecionar qual fila atender, randomicamente, ficou meio bugado, mas acho que esse não é o foco
        while(op!=0)
        {
            System.out.println("Chamar Fila: Tecle qualquer numero.");
            System.out.println("Sair: Tecle 0.");
            
            op = ler.nextInt();
            if(op !=0)
            { 
                mediador.atenderFila((int) (((Math.random() * 3)) + 1));    
            }
        }
    }
}
