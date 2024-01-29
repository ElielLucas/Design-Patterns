/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;

/**
 *
 * @author eliel.silva
 */
public class Bicicleta extends Veiculo implements EmissaoCO2{
    private double km;
    private double indice;

    public Bicicleta(String  tipo, String motor, double km, double indice) {
        super(tipo, motor);
        this.km = km;
        this.indice = indice;
    }


    public double getKM(){
        return km;
    }

    public double getIndice()
    {
        return indice;
    }

    @Override
    public double calculaCO2()
    {
        return km*indice;
    }
}
