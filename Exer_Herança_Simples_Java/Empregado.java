/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author eliel.silva
 */
public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    public Empregado(double salario, String matricula, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    protected Double getSalario() {
        return salario;
    }

    protected void setSalario(Double salario) {
        this.salario = salario;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorINSS()
    {
        double salario = getSalario();
        return salario - salario*0.05;
    }

    public String printEmpregado(){
        return printPessoa() + "Salario: " + salario + "\n" + "Matricula: " + matricula + "\n" + "INSS: " + valorINSS() + "\n";
    }
}
