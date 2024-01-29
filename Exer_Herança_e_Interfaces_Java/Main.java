/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author japa
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> vehicles = new ArrayList<>();
        Scanner l = new Scanner(System.in);


        System.out.println("Quantidade de carros: ");
        int qtd = l.nextInt();

        for(int i = 0; i<qtd;i++)
        {
            System.out.println("Qual veiculo? ");
            String t = l.next();

            if(t.equals("carro")){
                System.out.println("Tipo: ");
                String tipo = l.next();
                System.out.println("Motor: ");
                String motor = l.next();
                System.out.println("KM: ");
                double km = l.nextDouble();
                System.out.println("Indice: ");
                double indice = l.nextDouble();

                Veiculo v = new Carro(tipo, motor, km, indice);
                vehicles.add(v);
            }else if(t.equals("barco")){
                System.out.println("Tipo: ");
                String tipo = l.next();
                System.out.println("Motor: ");
                String motor = l.next();
                System.out.println("KM: ");
                double km = l.nextDouble();
                System.out.println("Indice: ");
                double indice = l.nextDouble();

                Veiculo v = new Barco(tipo, motor, km, indice);
                vehicles.add(v);
            }else if(t.equals("bicicleta")){
                System.out.println("Tipo: ");
                String tipo = l.next();
                System.out.println("Motor: ");
                String motor = l.next();
                System.out.println("KM: ");
                double km = l.nextDouble();
                System.out.println("Indice: ");
                double indice = l.nextDouble();

                Veiculo v = new Bicicleta(tipo, motor, km, indice);
                vehicles.add(v);
            }
        }


        for(Veiculo item : vehicles)
        {
            if(item instanceof Carro)
            {
                System.out.println("Carro");
                System.out.println("Tipo: " + item.getTipo());
                System.out.println("Motor: " + item.getMotor());
                System.out.println("KM: " + ((Carro) item).getKM());  
                System.out.println("Emissão de CO2: " + ((Carro) item).calculaCO2());
            }
             else if(item instanceof Barco)
             {
                 System.out.println("Barco");
                 System.out.println("Tipo: " + item.getTipo());
                 System.out.println("Motor: " + item.getMotor());
                 System.out.println("KM: " + ((Barco) item).getKM());
                 System.out.println("Emissão de CO2: " + ((Barco) item).calculaCO2());
             }else if(item instanceof Bicicleta)
             {
                 System.out.println("Bicicleta");
                 System.out.println("Tipo: " + item.getTipo());
                 System.out.println("Motor: " + item.getMotor());
                 System.out.println("KM: " + ((Bicicleta) item).getKM());
                 System.out.println("Emissão de CO2: " + ((Bicicleta) item).calculaCO2());
             }
             System.out.println("\n");
        }
    }
    
    
}
