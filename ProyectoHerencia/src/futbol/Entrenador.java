/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author rene
 */
public class Entrenador extends SeleccionFutbol{
    private String federacion;

    public Entrenador() {
    }

    public Entrenador(String federacion) {
        this.federacion = federacion;
    }

    public Entrenador(String federacion, String nombres, String apellidos, int edad, Pais pais) {
        super(nombres, apellidos, edad, pais);
        this.federacion = federacion;
    }

    public void dirigirPartido(){
        System.out.println("entrenador dirigiendo partido");
    }
    
    @Override
    public void viajar(){
        System.out.println("entrenador viajando");
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("dirigier entrenamiento");
    }
    /**
     * @return the federacion
     */
    public String getFederacion() {
        return federacion;
    }

    /**
     * @param federacion the federacion to set
     */
    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    
    
}
