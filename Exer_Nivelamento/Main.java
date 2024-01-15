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
public class Main {
    public static void main(String [] args){
       int escolha = 0;
       Scanner l = new Scanner(System.in);

       System.out.println("Digite qual o exercicio escolhido: ");
       escolha = l.nextInt();
       
       if(escolha == 6)
       {
            Atv6 x = new Atv6();
            x.exec();
       }else if(escolha == 10)
       {
            Atv10 x = new Atv10();
            x.exec();
       }
       
    }

}
