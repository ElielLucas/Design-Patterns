/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;
import interfaces.*;
import models.*;
/**
 *
 * @author Eliel
 */
public class Conversor220v110 implements Voltagem110{

    private Voltagem220 v220;
    
    public Conversor220v110(Voltagem220 v220) {
        this.v220 = v220;
    }

    @Override
    public String getEnergia110() {
        System.out.println("Convertendo voltagem de 220 para 110.");
        return "110v";
    }
}
