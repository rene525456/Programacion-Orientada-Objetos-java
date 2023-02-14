/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author rene
 */
public class SeleccionFutbol {
    private String nombres;
    private String apellidos;
    public int edad;
    private Pais pais;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(String nombres, String apellidos, int edad, Pais pais) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
    }
    
    public void concentrarse(){
        System.out.println("estamos concentrados el equipo de futbol");
    }
    
    public void viajar(){
        System.out.println("equipo viajando");
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
    
}
