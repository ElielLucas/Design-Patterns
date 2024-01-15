/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv;

import com.mycompany.atv.ex1;
import java.util.*;

/**
 *
 * @author eliel.silva
 */
public class Atv {
    public static void main(String [] args){
        Scanner l = new Scanner(System.in);
        System.out.println("Escolha o ex: ");
        
        int e = l.nextInt();
        
        if(e == 1)
        {
            ex1 x = new ex1();
            x.exec();
        }else if(e == 2)
        {
            ex2 x = new ex2();
            x.exec();
        }
    }

}