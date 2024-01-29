/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.*;

/**
 *
 * @author Eliel
 */
public class Tomada220V implements Voltagem220{
    public Tomada220V() {
    }

    @Override
    public String getEnergia220() {
        return "220v";
    } 
}
