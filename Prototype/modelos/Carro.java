/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.*;
/**
 *
 * @author eliel.silva
 */
public class Carro extends Veiculo{

    public Carro(ArrayList<Pneu> pneus) {
        super(pneus);
    }

    @Override
    public String toString() {
        String saida = "Carro\n";
        
        int cont = 1;
        for (Pneu pneu : pneus) {
            saida+= "Pneu: " + cont + "\n";
            saida += "Tipo: " + pneu.getTipo()+'\n';
            saida += "Aro: " + pneu.getAro()+"\n\n";
            cont++;
        }
        return saida;
    }
}
