/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author eliel.silva
 */
public class Pilotos {
    private String nome;
    private Pista pistaCorrida;

    public Pilotos() {
        nome = "";
        pistaCorrida = null;
    }

    public Pilotos(String nome, Pista pistaCorrida) {
        this.nome = nome;
        this.pistaCorrida = pistaCorrida;
        this.pistaCorrida.incQuantidadeDeCorredores();
    }
    
    public String printFicha(){
        String saida = "\n\nDados do Corredor \n";
        saida += "Nome: " + nome + "\n";
        saida += "Nome da Pista: " + pistaCorrida.getNomePista() + "\n";
        saida += "ID Pista: " + pistaCorrida.hashCode() + "\n";
        saida += "Quantidade de Corredores: " + pistaCorrida.getQuantidadeCorredores();
        return saida;
    }
    
    
}
