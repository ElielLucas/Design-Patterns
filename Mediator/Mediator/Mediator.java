/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Mediator;

import interfaces.Caixa;

/**
 *
 * @author Eliel
 */
public interface Mediator {
    public abstract void criaFilaPoupanca(Caixa p);
    public abstract void criaFilaSaque(Caixa p);
    public abstract void criaFilaCheque(Caixa p);
    public abstract void criaFilaDeposito(Caixa p);
    public abstract void controlaFila(int fila, int senha);
    public abstract void atenderFila(int fila);
    public abstract void printt();
    
}
