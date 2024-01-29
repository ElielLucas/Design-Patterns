/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Eliel
 */
public abstract class Salgado {
    private String massa;
    private String molho;
    private String recheio;

    public Salgado(String massa, String molho, String recheio) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }

    public String getMassa() {
        return massa;
    }

    public String getMolho() {
        return molho;
    }

    public String getRecheio() {
        return recheio;
    }
    
    public String printar()
    {
        String saida = "Massa: " + massa;
        saida = saida + "\nMolho: " + molho;
        saida = saida + "\nRecheio: " + recheio + "\n";
        
        return saida;
    }
       
}
