/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;

/**
 *
 * @author eliel.silva
 */
public abstract class Veiculo {
    private String tipo;
    private String motor;

    public Veiculo(String tipo, String motor)
    {
        this.tipo = tipo;
        this.motor = motor;
    }

    public String getTipo()
    {
        return tipo;
    }
    
    public String getMotor()
    {
        return motor;
    }
}
