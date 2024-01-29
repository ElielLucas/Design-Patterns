/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import interfaces.*;
/**
 *
 * @author eliel.silva
 */
public abstract class Salgado{
    protected Recheio recheio;

    public Salgado(Recheio recheio) {
        this.recheio = recheio;
    }
    
    
    public abstract String produzirSalgado();  
}
