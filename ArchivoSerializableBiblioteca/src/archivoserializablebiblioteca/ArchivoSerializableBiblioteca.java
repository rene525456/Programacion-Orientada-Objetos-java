/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivoserializablebiblioteca;

import archivo.AutorImplementacion;
import archivo.LibroImplementacion;
import java.util.Date;
import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author rene
 */
public class ArchivoSerializableBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Autor autor1 = new Autor("Rene", "ecuatoriana", new Date());
        Autor autor2 = new Autor("María", "colombiana", new Date());
        Autor autor3 = new Autor("Amparo", "americana", new Date());
        
        AutorImplementacion ai = new AutorImplementacion();
        ai.guardar(autor1);
        ai.guardar(autor2);
        ai.guardar(autor3);
        */
        LibroImplementacion l = new LibroImplementacion();
        Libro libro = l.buscar("45");
        
        System.out.println(libro.getTitulo());
    }
    
}
