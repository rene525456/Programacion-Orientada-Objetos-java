package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable{
    private String ISBN;
    private String clasificacion;
    private String titulo;
    private int anio;
    
    private List<Autor> autores;
    private List<Copia> ejemplares;
    private Editorial editorial;

    public Libro(String ISBN, String clasificacion, String titulo, int anio) {
        this.ISBN = ISBN;
        this.clasificacion = clasificacion;
        this.titulo = titulo;
        this.anio = anio;
        autores = new ArrayList<Autor>();
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
     * @return the ejemplares
     */
    public List<Copia> getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(List<Copia> ejemplares) {
        this.ejemplares = ejemplares;
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
/*
    @Override
    public String toString() {
        return "Libro " + titulo + " " + ISBN;
    }
  */  
    
    
}
