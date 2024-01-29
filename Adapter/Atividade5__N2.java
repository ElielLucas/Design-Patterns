/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade5__n2;
import java.util.*;
import models.*;
import adapter.*;


/**
 *
 * @author Eliel
 */
public class Atividade5__N2 {

    public static void main(String[] args) {
        
        ArCondicionado x1 = new ArCondicionado();      
        System.out.println(x1.testeLigacao(new Tomada110V())); 
        
//        ArCondicionado x2 = new ArCondicionado();      
//        System.out.println(x2.testeLigacao(new Tomada220V()));;
         
        ArCondicionado x3 = new ArCondicionado();      
        System.out.println(x3.testeLigacao(new Conversor220v110(new Tomada220V())));          
    }
}
