/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class TablaMultiplicacion {
    
    public void calcularTablaMultiplicarFor(int numero){
        for (int i = 1; i <= 12; i++) {
            System.out.format("%d * %d = %d", numero, i, (numero * i));
        }
    }
    
    public void generarTablas1Al12For(){
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.format("%d * %d = %d", i, j, (j * i));
            }
        }
    }
    
    public void calcularTablaMultiplicarWhile(int numero){
        int i = 1;
        while (i <= 12) {
            System.out.format("%d * %d = %d", numero, i, (numero * i));
            i++;
        }
    }

    public void generarTablas1Al12While(){
        int i = 1;
        while (i <= 12) {
            int j = 0;
            while (j <= 12) {
                System.out.format("%d * %d = %d", i, j, (j * i));
                j++;
            }
            i++;
        }
    }
}