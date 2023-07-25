/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public interface IEmpleado {
    
     public static final double sueldoBasico = 425.00;
     
     public default double getSueldoBasico(){
         return sueldoBasico;
     }
     
     public double calcularPago();
    
}
