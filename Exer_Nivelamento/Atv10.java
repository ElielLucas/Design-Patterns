/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;
import java.util.*;

/**
 *
 * @author eliel.silva
 */
public class Atv10 {
    ArrayList<Float> alturaM = new ArrayList<Float> (); 
    ArrayList<Float> alturaH = new ArrayList<Float> (); 
    ArrayList<String> sexoM = new ArrayList<String> (); 
    ArrayList<String> sexoH = new ArrayList<String> (); 

    float menorAlturaGrupo = 99999;
    float somaAlturaMulheres = 0;
    float maiorAlturaGrupo = -1;
    String sexoPessoaMaisAlta;

    void ler()
    {
        Scanner l = new Scanner(System.in);

        System.out.println("Digite os valores para 15 pessoas: ");

        for(int i = 0; i < 3; i++)
        {
            float altura;
            String sexo;

            System.out.println("Digite o sexo: ");
            sexo = l.next();

            System.out.println("Digite a altura: ");
            altura = l.nextFloat();

            if(sexo.equals("H"))
            {
                sexoH.add(sexo);
                alturaH.add(altura);
            }else if(sexo.equals("M"))
            {
                sexoM.add(sexo);
                alturaM.add(altura);

                somaAlturaMulheres = somaAlturaMulheres + altura;
            }

            if(altura < menorAlturaGrupo)
            {
                menorAlturaGrupo = altura;
            }

            if(altura > maiorAlturaGrupo)
            {
                maiorAlturaGrupo = altura;
                sexoPessoaMaisAlta = sexo;
            }
        }
    }

    void exec()
    {
        ler();

        System.out.println("Menor altura do grupo: " + menorAlturaGrupo);
        System.out.println("Média altura das mulheres: " + somaAlturaMulheres/sexoM.size());
        System.out.println("O número de homem: " + sexoH.size());
        System.out.println("Sexo pessoa mais alta: " + sexoPessoaMaisAlta);
    }
    
}
