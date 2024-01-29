/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2_n2;
import classes.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade2_N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilotos p1 = new Pilotos("Japa",Pista.getInstanciaDaPista());
        System.out.println(p1.printFicha());

        Pilotos p2 = new Pilotos("Goku",Pista.getInstanciaDaPista());      
        System.out.println(p2.printFicha());
        
        Pilotos p3 = new Pilotos("Jaspion",Pista.getInstanciaDaPista());    
        System.out.println(p3.printFicha());
        
        Pilotos p4 = new Pilotos("Luffy",Pista.getInstanciaDaPista());    
        System.out.println(p4.printFicha());
    }
    
}
