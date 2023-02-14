/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopolimorfismooperaciones;

import java.util.Scanner;

/**
 *
 * @author rene
 */
public abstract class OperacionPadre {
    protected int valor1;
    protected int valor2;
    protected int resultado;
    private Scanner lector;

    public OperacionPadre() {
        lector = new Scanner(System.in);
    }
    
    public void pedirDatos(){
        System.out.println("Ingrese el valor 1");
        valor1 = lector.nextInt();
        System.out.println("Ingrese el valor 2");
        valor2 = lector.nextInt();
    }
    
    public void mostrarResultado(){
        System.out.println("El resultado de la operacion es: " + resultado);
    }
    
    public abstract void operacion();
}
