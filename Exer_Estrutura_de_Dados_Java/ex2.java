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
public class ex2 {
    private ArrayList<Double> listaN = new ArrayList();
    Double soma;
    Scanner l = new Scanner(System.in);
    
    public void exec()
    {
        lerNumeros();
        imprimirIterator();
        listaN.set(5, 9.7);
        imprimirIterator();
        media();
        maior();
        clearAndTest();      
    }
    public void lerNumeros()
    {
        soma = 0.0;
        System.out.println("Digite 10 números doubles: ");
        for(int i = 0; i<10; i++)
        {
            Double x = l.nextDouble();
            soma += x;
            listaN.add(x);          
        }      
    }
    
    public void imprimirIterator()
    {
        System.out.println("\n\n");
        Iterator<Double> iterator = listaN.iterator();
        
        for(int i = 0; i<10;i++)
        {
            System.out.println(iterator.next());
        }    
    }  
    
    public void media()
    {
        System.out.println("\n" + soma/10);      
    } 
    
    public void maior()
    {
        Double maior = -9999.9;
        
        Iterator<Double> iterator = listaN.iterator();
        
        for(int i = 0; i<10;i++)
        {
            Double x = iterator.next();
            if(x>maior)
            {
                maior = x;
            }
        }  
        
        System.out.println(maior);   
    } 
    
    public void clearAndTest()
    {
       listaN.clear();
       
       if(listaN.isEmpty())
       {
           System.out.println("Está vazia");
       }else
       {
           System.out.println("Não está vazia");
       }
    } 
}
