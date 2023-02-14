/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoconversiones;

/**
 *
 * @author rene
 */
public class ConversionesDistancia {
    
    private double distancia;
    private double tiempo;
    private double velocidad;
    
    public double convertirKmMetros(double v){
        velocidad = v * 1000 / 3600;
        return velocidad;
    }
    
}
