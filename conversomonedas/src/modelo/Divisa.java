/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rene
 */
public class Divisa {
    
    public double conversor(int cantidad, String divisaEntrada, String divisaSalida){
        double resultado = 1;
        if (divisaEntrada.equals("Dolar"))
            if (divisaSalida.equals("Euro"))
                resultado = cantidad * 0.98;
            if (divisaSalida.equals("Libra"))
                resultado = cantidad * 0.85;
            if (divisaSalida.equals("Yam"))
                resultado = cantidad * 600;
        if (divisaEntrada.equals("Euro"))
            if (divisaSalida.equals("Dolar"))
                resultado = cantidad * 1.02;
            if (divisaSalida.equals("Libra"))
                resultado = cantidad * 0.87;
            if (divisaSalida.equals("Yam"))
                resultado = cantidad * 145.37;
        if (divisaEntrada.equals("Libra"))
            if (divisaSalida.equals("Dolar"))
                resultado = cantidad * 1.18;
            if (divisaSalida.equals("Euro"))
                resultado = cantidad * 1.15;
            if (divisaSalida.equals("Yam"))
                resultado = cantidad * 167.38;
        return resultado;
    }
    
}
