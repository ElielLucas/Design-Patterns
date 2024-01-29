/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade4_n2;

import java.util.ArrayList;
import modelos.*;
/**
 *
 * @author eliel.silva
 */
public class Atividade4_N2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        ArrayList<Pneu> pneus;
        pneus = new ArrayList<>();
        Pneu p = new Pneu("Firestone", 16); 
        pneus.add(p);
        pneus.add((Pneu)p.clone());
        pneus.add((Pneu)p.clone());
        pneus.add((Pneu)p.clone());
        
        Veiculo v1 = new Carro(pneus);
        System.out.println(v1.toString());
        
        
        pneus.clear();
        Pneu p2 = new Pneu("Michelin", 30); 
        pneus.add(p2);
        pneus.add((Pneu)p2.clone());
        pneus.add((Pneu)p2.clone());
        pneus.add((Pneu)p2.clone());
        pneus.add((Pneu)p2.clone());
        pneus.add((Pneu)p2.clone());
        
        Veiculo v2 = new Caminhao(pneus);
        System.out.println(v2.toString());
        
    }
}
