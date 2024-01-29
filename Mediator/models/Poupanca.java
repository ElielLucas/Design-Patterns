/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import Mediator.Mediator;
import interfaces.*;
import java.util.ArrayList;
/**
 *
 * @author Eliel
 */
public class Poupanca implements Caixa{
    private ArrayList<Integer> fila;
    private Mediator controlador;

    public Poupanca(Mediator controlador) {
        fila = new ArrayList<>();
        this.controlador = controlador;
    }
    
    @Override
    public void listaFila()
    {
        System.out.println("Fila Poupanca:");
        System.out.println(fila);
    }
    @Override
    public void redirecionar(int senha)
    {
        fila.add(senha);
    }
    @Override
    public void atender()
    {
        if(!fila.isEmpty())
        {
            System.out.println("Poupanca: Atendimento realizado!");
            fila.remove(0);
            this.listaFila();
        }
    }
}
