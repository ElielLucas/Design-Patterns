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
public class Tomada110V implements Voltagem110{

    public Tomada110V() {
    }

    @Override
    public String getEnergia110() {
        return "110v";
    } 
}
