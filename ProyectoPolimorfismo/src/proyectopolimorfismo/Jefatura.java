/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopolimorfismo;

/**
 *
 * @author rene
 */
public class Jefatura extends Empleado{

    private double incentivo;
    
    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }

    /**
     * @return the incentivo
     */
    public double getIncentivo() {
        return incentivo;
    }

    /**
     * @param incentivo the incentivo to set
     */
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    public double getSueldo(){
        return super.getSueldo() + incentivo; 
    }

    @Override
    public void subirSueldo(int porcentaje) {
        
        double aumento = getSueldo() * porcentaje / 100;
        
        setSueldo(getSueldo() + aumento);
    }
    
}
