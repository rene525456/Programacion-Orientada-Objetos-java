/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopolimorfismooperaciones;

/**
 *
 * @author rene
 */
public class OperacionResta extends OperacionPadre{
    
    @Override
    public void operacion(){
        resultado = valor1 - valor2;
    }
}
