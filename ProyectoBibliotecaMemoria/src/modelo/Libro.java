
package modelo;

import java.io.Serializable;
import java.util.List;


public class Libro implements Serializable{
    private String titulo;
    private String clasificacion;
    private int anio;
    private TipoLibro tipo;
    
    private List<Copia> copias;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, String clasificacion, int anio, TipoLibro tipo, Editorial editorial) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.tipo = tipo;
        this.editorial = editorial;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the tipo
     */
    public TipoLibro getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoLibro tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the copias
     */
    public List<Copia> getCopias() {
        return copias;
    }

    /**
     * @param copias the copias to set
     */
    public void setCopias(List<Copia> copias) {
        this.copias = copias;
    }

    /**
     * @return the autores
     */
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    /**
     * @return the editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    
    
    
}
