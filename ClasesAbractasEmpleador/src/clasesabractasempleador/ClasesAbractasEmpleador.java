/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesabractasempleador;

import java.util.ArrayList;
import java.util.List;
import modelo.Comercial;
import modelo.Empleado;
import modelo.Repartidor;

/**
 *
 * @author rene
 */
public class ClasesAbractasEmpleador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comercial c1 = new Comercial("Karina", 35, 750, 201);
        //c1.aumentarSalario();
        Comercial c2 = new Comercial("Amparo", 25, 900, 300);
        //c2.aumentarSalario();
        Repartidor r1 = new Repartidor("César", 20, 400, "zona 1");
        //r1.aumentarSalario();
        Repartidor r2 = new Repartidor("Gerardo", 19, 500, "zona 3");
        //r2.aumentarSalario();
        
        // se aplica el polimorfimos
        List<Empleado> listaEmpleado = new ArrayList<Empleado>();
        listaEmpleado.add(c1);
        listaEmpleado.add(c2);
        listaEmpleado.add(r1);
        listaEmpleado.add(r2);
        for (Empleado empleado : listaEmpleado) {
            empleado.aumentarSalario();
        }
    }
    
}
