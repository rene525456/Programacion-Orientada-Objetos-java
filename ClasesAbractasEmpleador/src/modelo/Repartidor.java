/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Repartidor extends Empleado{
    
    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean aumentarSalario() {
        System.out.println(toString());
        if(getEdad() < 25 && zona.equalsIgnoreCase("zona 3")){
            salario += PLUS;
            System.out.println("Se aumentó el salario: " + salario);
            return true;
        }else
            System.out.println("NO se aumentó el salario: " + salario);
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Zona1:" + zona; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    
    
    
}
