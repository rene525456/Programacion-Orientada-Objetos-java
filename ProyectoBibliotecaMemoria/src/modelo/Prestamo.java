/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rene
 */
public class Prestamo implements Serializable{
    private Date fecha;
    private Lector lector;
    private List<Copia> copias;

    public Prestamo() {
    }

    public Prestamo(Date fecha) {
        this.fecha = fecha;
        this.lector = lector;
    }
    
    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the lector
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * @param lector the lector to set
     */
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    /**
     * @return the copias
     */
    public List<Copia> getCopias() {
        return copias;
    }
    
   
}