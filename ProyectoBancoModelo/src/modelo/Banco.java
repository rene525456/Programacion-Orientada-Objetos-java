/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rene
 */
public class Banco {
    private String codigo;
    private String direccion;
    
    private List<ATM> listaCajeros;
    private List<Cuenta> listaCuentas;

    public Banco(String codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
        listaCajeros = new ArrayList<ATM>();
        listaCuentas = new ArrayList<Cuenta>();
    }
    
    public void agregarCajero(ATM cajero){
        listaCajeros.add(cajero);
    }
    
    public void quitarCajero(int posicion){
        listaCajeros.remove(posicion);
    }
    
    
}
