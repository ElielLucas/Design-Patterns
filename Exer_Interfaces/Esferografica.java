/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv10;

/**
 *
 * @author eliel.silva
 */
public class Esferografica implements Caneta {
    private String cor;

    public Esferografica(String cor){
        this.cor = cor;
    }
    @Override
    public String getCor(){return cor;}

    @Override
    public void escrever(String texto)
    {
        System.out.println("Usando " + texto + " à caneta esferográfica.");
    }

    public static void escreverTexto(Caneta c, String texto)
    {
        
    }

    
}
