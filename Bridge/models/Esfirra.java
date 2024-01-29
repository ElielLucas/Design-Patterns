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
public class Esfirra extends Salgado{
    public Esfirra(Recheio recheio) {
        super(recheio);
    }
    
    @Override
    public String produzirSalgado() {
        return "Salgado produzido: Esfirra - " + recheio.rechear();
    }
}
