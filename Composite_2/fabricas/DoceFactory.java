/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;
import model.*;
/**
 *
 * @author eliel.silva
 */
public class DoceFactory {
    public static Doce fazerDoce(String tipo) {
        switch (tipo) {
            case "bolo":
                return new Bolo();
            case "brigadeiro":
                return new Brigadeiro();
            case "sorvete":
                return new Sorvete();
        }
        return null;
    }
}
