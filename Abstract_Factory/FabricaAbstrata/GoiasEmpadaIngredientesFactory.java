/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaAbstrata;

/**
 *
 * @author Eliel
 */
public class GoiasEmpadaIngredientesFactory extends SalgadoIngredientesFactory{ 
    @Override
    public String criarMassa()
    {
        return "Podre";
    }
    @Override
    public String criarMolho()
    {
        return "Tomate";
    }
    @Override
    public String criarRecheio()
    {
        return "Calabresa";
    }
}
