/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;
import interfaces.*;
import model.*;
/**
 *
 * @author eliel.silva
 */
public class Ales {
    private Cerveja ale;
    private Cerveja porter;
    private Cerveja stout;
    private Cerveja trigo;

    public Ales() {
        this.ale = new Ale();
        this.porter = new Porter();
        this.stout = new Stout();
        this.trigo = new Trigo();
    }
    
    public void produzirAle()
    {
        ale.produzir();
    }
    public void produzirPorter()
    {
        porter.produzir();
    }
    public void produzirStout()
    {
        stout.produzir();
    }
    public void produzirTrigo()
    {
        trigo.produzir();
    }
}
