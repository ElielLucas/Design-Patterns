/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.List;
import interfaces.*;
import java.util.ArrayList;
import model.*;


/**
 *
 * @author Eliel
 */
public class CaixaCafeManha implements Produto{
      private List<Produto> childs;
      private String tipo;

    public CaixaCafeManha(String tipo) {
        this.tipo = tipo;
        this.childs = new ArrayList<>();
    }
    
    public void addProduto(Produto child)
    {
        childs.add(child);
    }
    
    public void removeProduto(Produto child)
    {
        childs.remove(child);
    }
    
    @Override
    public void listar()
    {
        childs.forEach(Produto::listar);
    }
    
    @Override
    public  String getTipo()
    {
        return tipo;
    }
      
}
