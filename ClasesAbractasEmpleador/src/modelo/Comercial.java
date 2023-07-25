/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Comercial extends Empleado{

    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    @Override
    public boolean aumentarSalario() {
        System.out.println(toString());
        if(getEdad() > 30 && comision > 200){
            salario += PLUS; // salario = salario + PLUS
            System.out.println("Se aumentó el salario: "  + salario);
            return true;
        }else
            System.out.println("NO se aumentó el salario: "  + salario);
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Comisión: " + comision;
    }
    
    public double getComision() {
        return comision;
    }

    
    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    
}
