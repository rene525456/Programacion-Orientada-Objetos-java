/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Empleado implements IEmpleado{

    private String nombres;
    private String puesto;
    private String telefono;
    
    public Empleado (String nombres){
        this.nombres = nombres;
    }

    public Empleado(String nombres, String puesto, String telefono) {
        this.nombres = nombres;
        this.puesto = puesto;
        this.telefono = telefono;
    }
    
    @Override
    public double calcularPago() {
        return getSueldoBasico();
    }

    @Override
    public String toString() {
        return getNombres();
    }  

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
