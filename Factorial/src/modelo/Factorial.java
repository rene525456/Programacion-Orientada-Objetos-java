/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Factorial {
    
    public int calcularFactorialFor(int numero){
        int factorial = 1;
        for(int i = 1; i <= numero; i++){
            //factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }
    
    public int calcularFactorialWhile(int numero){
        int contador = 1;
        int factorial = 1;
        while (contador <= numero){
            factorial *= contador;
            contador++;
        }    
        return factorial;
    }
}
















