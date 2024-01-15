/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv;

import java.util.*;

/**
 *
 * @author puc
 */
public class ex1 {
    private ArrayList<Integer> listaN = new ArrayList();
    Scanner l = new Scanner(System.in);
    
    public void exec()
    {
        lerNumeros();
        imprimirPares();
    }
    
    public void lerNumeros()
    {
        System.out.println("Digite 10 números: ");
        for(int i = 0; i<10; i++)
        {
            listaN.add(l.nextInt());          
        }      
    }
    
    public void imprimirPares()
    {
        System.out.println("\n\n");
        for(int i = 0; i<10; i++)
        {
            int x = listaN.get(i);
            if(x%2 == 0)
            {
                System.out.println(listaN.get(i));  
            }   
        }      
    }
    
}
