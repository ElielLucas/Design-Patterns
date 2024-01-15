/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;


public class Mavenproject1 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", 33, "Masculino");

        System.out.println(p.printPessoa() + "\n");

        Empregado emp = new Empregado(5000.00, "1400", "Ana", 21, "Feminino");
        System.out.println(emp.printEmpregado() + "\n");

        Cliente cli = new Cliente(2000.00, 1976, "Almir", 40, "Masculino");
        System.out.println(cli.printCliente() + "\n");

        Gerente gerent = new Gerente("Atendimento", 15000.00, "1300", "Tania", 30, "");
        System.out.println(gerent.printGerente() + "\n");

        Vendedor vend = new Vendedor(14000.00, 120, 0, "", "Igor", 30, "");
        System.out.println(vend.printVendedor() + "\n");







        // Aluno objAluno = new Aluno();
        // Professor objProfessor = new Professor("Kamehameha","Mestre KAME", 90);
        // Pessoa objPessoa = new Pessoa ("KAIO",1000);
        
        // System.out.println("Professor: " + objProfessor.getNome());
        // System.out.println("Idade    : " + objProfessor.getIdade());
        // System.out.println("Materia  : " + objProfessor.getMateria());
        // objProfessor.setNome("GOKU");
        // //objAluno.nome="JAPA";
        // System.out.println("Professor: " + objProfessor.getNome());
        // System.out.println("Idade    : " + objProfessor.getIdade());
        // System.out.println("Materia  : " + objProfessor.getMateria()); 
       
    }
}
