/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Taxi extends Vehiculo{
    private String cooperativa;
    private String tipo;

    public Taxi() {
    }

    public Taxi(String cooperativa, String tipo) {
        this.cooperativa = cooperativa;
        this.tipo = tipo;
    }

    public Taxi(String cooperativa, String tipo, String marca, double precio, String matricula) {
        super(marca, precio, matricula);
        this.cooperativa = cooperativa;
        this.tipo = tipo;
    }

    /**
     * @return the cooperativa
     */
    public String getCooperativa() {
        return cooperativa;
    }

    /**
     * @param cooperativa the cooperativa to set
     */
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
