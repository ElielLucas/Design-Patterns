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
public class ArCondicionado{

    private Voltagem110 ligacao;

    public ArCondicionado() {
        this.ligacao = new Tomada110V();
    }
    
    public String testeLigacao(Voltagem110 energia)
    {
        System.out.println("Conectando na energia");
        if(energia.getEnergia110().equals(ligacao.getEnergia110()))
            return "Podemos ligar o ar condicionado.";    
        return "Podemos ligar o ar condicionado.";
    }
}
