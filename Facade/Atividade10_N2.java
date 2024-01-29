/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade10_n2;
import model.*;
import Facade.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade10_N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ales cervejasAles = new Ales();
        
        cervejasAles.produzirAle();
        cervejasAles.produzirPorter();
        cervejasAles.produzirStout();
        cervejasAles.produzirTrigo();
        
        
        System.out.println("----------------------------------");
        
        Lagers cervejasLagers = new Lagers();
        
        cervejasLagers.produzirLager();
        cervejasLagers.produzirMunich();
        cervejasLagers.produzirVienna();        
    }
    
}
