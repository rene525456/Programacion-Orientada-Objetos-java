/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author rene
 */
public class Masajista extends SeleccionFutbol{
    public String titulacion;
    private int experiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int experiencia) {
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }

    public Masajista(String titulacion, int experiencia, String nombres, String apellidos, int edad, Pais pais) {
        super(nombres, apellidos, edad, pais);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }
    
    public void darMasaje(){
        System.out.println("dando masaje");
    }
    
    @Override
    public void concentrarse(){
        System.out.println("masajista concentrado");
    }
    

    /**
     * @return the experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
}
