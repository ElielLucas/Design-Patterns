/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author eliel.silva
 */
public class Pneu implements Cloneable{
    private String tipo;
    private int aro;

    public Pneu(String tipo, int aro) {
        this.tipo = tipo;
        this.aro = aro;
    }

    public int getAro() {
        return aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }
}
