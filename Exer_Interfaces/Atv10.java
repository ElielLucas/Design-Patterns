/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv10;


import java.util.*;

/**
 *
 * @author eliel.silva
 */
public class Atv10 {

    /**
     * @param args the command line arguments
     */

    public static void escreverTexto(Caneta c, String texto)
    {
        c.escrever(texto);
        System.out.println("Cor = " + c.getCor());
    }
    public static void main(String[] args) {
        Caneta esf = new Esferografica("Azul");
        escreverTexto(esf, "Teste de Escrita");

        Caneta lap = new Lapis("Preto");
        escreverTexto(lap, "Teste de Escrita");

        Caneta giz = new Giz("Verde");
        escreverTexto(giz, "Teste de Escrita");
    }

    
}
