/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class CuentaCorriente extends Cuenta{
    private String numeroCC;

    public CuentaCorriente(String numeroCC, String numero, double balance) {
        super(numero, balance);
        this.numeroCC = numeroCC;
    }

    /**
     * @return the numeroCC
     */
    public String getNumeroCC() {
        return numeroCC;
    }

    /**
     * @param numeroCC the numeroCC to set
     */
    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    

    
    
    
}
