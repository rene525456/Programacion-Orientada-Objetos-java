/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Bus extends Vehiculo{
    private int capacidad;

    public Bus() {
    }

    public Bus(int capacidad) {
        this.capacidad = capacidad;
    }

    public Bus(int capacidad, String marca, double precio, String matricula) {
        super(marca, precio, matricula);
        this.capacidad = capacidad;
    }
    
    @Override
    public void frenar(){
        System.out.println("Estoy frenando desde el bus");
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
