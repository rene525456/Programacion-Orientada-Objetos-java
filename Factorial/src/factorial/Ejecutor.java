/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Factorial;

/**
 *
 * @author rene
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Factorial f = new Factorial();
        System.out.println("Ingrese un número");
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        
//        System.out.format("El número es %d: ", n );
        //JOptionPane.showMessageDialog(null, "Ingrese un número: " + f.calcularFactorial(n));
        //System.out.println("Ingrese un número: " + f.calcularFactorial(n));
        
//        int a = 5, b =0;
//        b = ++a;
//        System.out.println("Operador de incremento = " + a);
//        System.out.println("La variable b = " + b);
        
//        a = 5;
//        b = --a;
//        System.out.println("Operador de decremento = " + a);
//        System.out.println("La variable b = " + b);
        Factorial f1 = new Factorial();
        int resultado = f1.calcularFactorialWhile(n);
        JOptionPane.showMessageDialog(null, "Factorial = " + resultado);
    }
    
}
