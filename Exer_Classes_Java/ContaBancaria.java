/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author eliel
 */
public class ContaBancaria {

    private float saldo;

    public ContaBancaria(){
        saldo = 500;
    }

    public float getSaldo(){
        return saldo;
    }

    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(float valor){
        this.saldo = this.saldo - valor;
    }
}
