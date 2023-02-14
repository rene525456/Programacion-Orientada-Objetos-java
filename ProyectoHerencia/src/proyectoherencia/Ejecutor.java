/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoherencia;

import futbol.Futbolita;
import futbol.Pais;
import modelo.Bus;
import modelo.Taxi;
import modelo.Vehiculo;

/**
 *
 * @author rene
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolita enner = new Futbolita();
        enner.setNombres("Enner");
        enner.setApellidos("Valencia");
        enner.edad = 34;
        Pais pais = new Pais("Ecuador");
        enner.setPais(pais);
        enner.dorsal = 10;
        enner.setDemarcacion("Delantero");
        
        Futbolita caicedo = new Futbolita(9, "centra", "Moises", "Caicdeo", 20, pais);
        //a.	Imprimir sus nombres, apellidos y la edad, y el pais del equipo
        System.out.println(enner.getNombres());
        System.out.println(enner.getApellidos());
        System.out.println(enner.edad);
        System.out.println(enner.getPais().getNombre());
        //b.	Imprimir su dorsal y demarcación
        System.out.println(enner.dorsal);
        System.out.println(enner.getDemarcacion());
        //c.	Imprimir su método concentrarse

    }
    
}















