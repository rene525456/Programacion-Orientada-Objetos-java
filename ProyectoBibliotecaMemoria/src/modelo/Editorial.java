/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author rene
 */
public class Editorial implements Serializable{
    private String nombre;
    private String ciudad;
    private String direccion;
    
    //private List<Libro> libros;

    public Editorial() {
    }

    public Editorial(String nombre, String ciudad, String direccion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*
    public List<Libro> getLibros() {
        return libros;
    }

    
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    */
    
}
