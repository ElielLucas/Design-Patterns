/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

import interfaces.Caixa;
import java.util.ArrayList;
import models.*;

/**
 *
 * @author Eliel
 */
public class MediatorImplementacao implements Mediator{
    private Caixa filaCheque;
    private Caixa filaDeposito;
    private Caixa filaPoupanca; 
    private Caixa filaSaque;
      
    @Override
    public void criaFilaPoupanca(Caixa p)
    {
        filaPoupanca = p;
    }
    
    @Override
    public void criaFilaSaque(Caixa p)
    {
        filaSaque = p;
    }
    
    @Override
    public void criaFilaCheque(Caixa p)
    {
        filaCheque = p;
    }
    
    @Override
    public void criaFilaDeposito(Caixa p)
    {
        filaDeposito = p;
    }
    
    @Override
    public void controlaFila (int fila, int senha)
    {
        switch (fila) 
        {
            case 1 -> filaPoupanca.redirecionar(senha);
            case 2 -> filaSaque.redirecionar(senha);
            case 3 -> filaCheque.redirecionar(senha);
            case 4 -> filaDeposito.redirecionar(senha);
            default -> {}
        }
    }
    
    @Override
    public void atenderFila(int fila)
    {
        switch (fila) 
        {
            case 1 -> filaPoupanca.atender();
            case 2 -> filaSaque.atender();
            case 3 -> filaCheque.atender();
            case 4 -> filaDeposito.atender();
            default -> {}
        }
    }
    
    @Override
    public void printt()
    {
        filaPoupanca.listaFila();
        filaSaque.listaFila();
        filaCheque.listaFila();
        filaDeposito.listaFila();
    }
}
