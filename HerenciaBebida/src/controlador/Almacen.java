/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Bebida;


public class Almacen {
    private List<Bebida> estantería;

    public Almacen() {
        estantería = new ArrayList<Bebida>();
    }
    
    public void agregarBebida(Bebida bebida){
        System.out.println("Bebida agregada");
        estantería.add(bebida);
    }
    
    public void mostrarBebidas(){
        for (Bebida bebida : estantería) {
            System.out.println(bebida.toString());
        }
    }
    
    public double calcularPrecioBebidas(){
        double precioTotal = 0;
        for (Bebida bebida : estantería) {
            precioTotal += bebida.getPrecio();
        }
        return precioTotal;
    }
    
    public double calcularPrecioPorMarcas(String marca){
        double precioTotal = 0;
        for (Bebida bebida : estantería) 
            if(bebida.getMarca().equalsIgnoreCase(marca))
                precioTotal += bebida.getPrecio();
        return precioTotal;
    }
}
