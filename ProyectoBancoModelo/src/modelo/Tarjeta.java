/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Tarjeta {
    private String codigo;
    private String password;
    
    private Cuenta cuenta;
    private BarraMagnetica barra;

    public Tarjeta(String codigo, String password) {
        this.codigo = codigo;
        this.password = password;
        barra = new BarraMagnetica("3245346354645");
    }

    
    
    @Override
    public String toString() {
        return "Tarjeta - " + getCodigo() + " " + getPassword();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the barra
     */
    public BarraMagnetica getBarra() {
        return barra;
    }

    /**
     * @param barra the barra to set
     */
    public void setBarra(BarraMagnetica barra) {
        this.barra = barra;
    }

    

    
    
    
}
