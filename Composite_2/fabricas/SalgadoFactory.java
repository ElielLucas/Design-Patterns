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
public class SalgadoFactory {
    public static Salgado assarSalgado(String tipo) {
        switch (tipo) {
            case "coxinha":
                return new Coxinha();
            case "esfirra":
                return new Esfirra();
            case "quibe":
                return new Quibe();
        }
        return null;
    }
}
