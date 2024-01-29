/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaAbstrata;

/**
 *
 * @author Eliel
 */
public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    @Override
    public String criarMassa()
    {
        return "Crepioca";
    }
    @Override
    public String criarMolho()
    {
        return "Camarao";
    }
    @Override
    public String criarRecheio()
    {
        return "Peixe";
    }
}
