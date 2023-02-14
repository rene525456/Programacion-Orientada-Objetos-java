/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author rene
 */
public class Futbolita extends SeleccionFutbol{
    
    public int dorsal;
    private String demarcacion;

    public Futbolita() {
    }

    public Futbolita(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolita(int dorsal, String demarcacion, String nombres, String apellidos, int edad, Pais pais) {
        super(nombres, apellidos, edad, pais);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido(){
        System.out.println("futbolitas jugando partido");
    }
    
    public void entrenar(){
        System.out.println("futbolita entrenando");
    }
    
    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
}
