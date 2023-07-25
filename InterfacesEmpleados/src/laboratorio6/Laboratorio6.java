/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio6;

import java.util.ArrayList;
import java.util.List;
import modelo.Consultor;
import modelo.Empleado;
import modelo.IEmpleado;
import modelo.Trabajador;

/**
 *
 * @author rene
 */
public class Laboratorio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("José");
        //System.out.println(empleado.toString() + " Sueldo = " + empleado.calcularPago());
        Trabajador trabajador = new Trabajador("Karina", 300, 0.10);
        //System.out.println(trabajador.toString() + " Sueldo = " + trabajador.calcularPago());
        Consultor consultor = new Consultor("Diana", 40, 6.0);
        //System.out.println(consultor.toString() + " Sueldo = " + consultor.calcularPago());
        
        // polimorfismo
        //Un objeto puede adoptar diferentes formas
        List<IEmpleado> lista = new ArrayList<IEmpleado>();
        lista.add(empleado);
        lista.add(trabajador);
        lista.add(consultor);
        
        for (IEmpleado empleado1 : lista) {
            System.out.println(empleado1.toString() + " Sueldo = " + empleado1.calcularPago());
        }
        
    }
}
