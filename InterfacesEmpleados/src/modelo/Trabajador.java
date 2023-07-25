/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Trabajador extends Empleado{
    
    private double sueldo;
    private double porcentajeSeguro;

    public Trabajador(String nombres, double sueldo, double porcentajeSeguro) {
        super(nombres);
        this.sueldo = sueldo;
        this.porcentajeSeguro = porcentajeSeguro;
    }

    @Override
    public double calcularPago() {
        return sueldo - (porcentajeSeguro * sueldo);
    }

    @Override
    public String toString() {
        return "Trabajador: " +  getNombres(); 
    }
}
