/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author eliel.silva
 */
public class Pista {
    private String nome = "Autodromo Internacional de Goiania";
    private static int quantidadeCorredores = 0;
    private static Pista pistaUnica = null;

    private Pista() {
    }
    
    public static Pista getInstanciaDaPista(){
        if(pistaUnica == null) pistaUnica = new Pista();
        return pistaUnica;
    }
    
    public void incQuantidadeDeCorredores() {
        this.quantidadeCorredores++;
    }

    public static int getQuantidadeCorredores() {
        return quantidadeCorredores;
    }

    public String getNomePista() {
        return nome;
    }
    
    
    
    
}
