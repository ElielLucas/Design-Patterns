/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;
import FabricaAbstrata.*;
import model.*;

/**
 *
 * @author Eliel
 */
public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;

    public void assarSalgado(String tipo, String regiao)
    {
        switch (tipo)
        {
            case "coxinha":  
                 ingredientes = getIngredientesCoxinha(regiao);
                 salgadinho = new Coxinha(ingredientes);
                 break;
            case "empada":        
                 ingredientes = getIngredientesEmpada(regiao);
                 salgadinho = new Empada(ingredientes);
                 break;
                 
            default:
                throw new AssertionError();
        }    
    }
    
    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao)
    {
        if (regiao.equals("Goias"))
            return new GoiasCoxinhaIngredientesFactory();
        else if (regiao.equals("Ceara"))
            return new CearaCoxinhaIngredientesFactory();
        return null;
    }
    
    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao)
    {
        if (regiao.equals("Goias"))
            return new GoiasEmpadaIngredientesFactory();
        else if (regiao.equals("Ceara"))
            return new CearaEmpadaIngredientesFactory();
        return null;
    }
    
    public Salgado getSalgadinho()
    {
         return salgadinho;
    }
}
