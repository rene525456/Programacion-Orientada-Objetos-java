/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecetocalculadora;

import java.util.Scanner;
import proyecetocalculadora.modelo.Operaciones;

/**
 *
 * @author rene
 */
public class ProyecetoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        //double c = op.sumar(5,6);

       
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = lector.nextLine();
        System.out.println("Buenos dias " + nombre);
        System.out.println("Ingrese numero 1");
        double valor1 = lector.nextDouble();
        System.out.println("Ingrese numero 2");
        double valor2 = lector.nextDouble();
        
        double c = op.sumar(valor1, valor2);
        double r = op.restar(valor1, valor2);
        
        System.out.println("La suma es " + c);
        System.out.println("La resta es " + r);
        //System.out.println("La suma es " + op.sumar(6, 3));
    }
    
}









