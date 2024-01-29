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
public class Coxinha extends Salgado{

    public Coxinha(Recheio recheio) {
        super(recheio);
    }

    @Override
    public String produzirSalgado() {
        return "Salgado produzido: Coxinha - " + recheio.rechear();
    }
}
