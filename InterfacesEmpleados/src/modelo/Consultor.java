/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Consultor extends Empleado{
    private int horas;
    private double tarifa;

    public Consultor(String nombres, int horas, double tarifa) {
        super(nombres);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularPago() {
        return horas * tarifa;
    }

    @Override
    public String toString() {
        return "Consultor " + getNombres();
    }
}
