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
public class Lagers {
    private Cerveja lager;
    private Cerveja munich;
    private Cerveja vienna;

    public Lagers() {
        this.lager = new Lager();
        this.munich = new Munich();
        this.vienna = new Vienna();
    }
    
    public void produzirLager()
    {
        lager.produzir();
    }
    public void produzirMunich()
    {
        munich.produzir();
    }
    public void produzirVienna()
    {
        vienna.produzir();
    }
}
