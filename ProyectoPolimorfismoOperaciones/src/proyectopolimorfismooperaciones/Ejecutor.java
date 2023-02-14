/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopolimorfismooperaciones;

/**
 *
 * @author rene
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OperacionPadre op = new OperacionPadre();
        /*op.pedirDatos();
        op.operacion();
        op.mostrarResultado();
        */
        /*
        op = new OperacionSuma(); //
        op.pedirDatos();  // padre
        op.operacion();   // hijo sobreescriendo
        op.mostrarResultado();  // padre
        */
        OperacionPadre op = new OperacionResta();
        op. pedirDatos();
        op.operacion();
        op.mostrarResultado();
        
        
    }
    
}







