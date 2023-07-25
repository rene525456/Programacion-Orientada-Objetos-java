/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobancomodelo;

import modelo.Tarjeta;

/**
 *
 * @author rene
 */
public class ProyectoBancoModelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarjeta j = new Tarjeta("05323454","pass123");
        System.out.println(j.toString());
    }
    
}
