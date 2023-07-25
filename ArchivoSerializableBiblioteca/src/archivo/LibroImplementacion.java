/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author rene
 */
public class LibroImplementacion implements LibroDao{

    private List<Libro> listaLibros;
        
    @Override
    public boolean guardar(Libro libro) {
        try{
            List<Libro> lista = listarTodos();
            lista.add(libro);
            FileOutputStream stream = new FileOutputStream("libros.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(stream);
            escritor.writeObject(lista);
            escritor.close();
            stream.close();
            return true;
            
        }catch(Exception ex){
            System.out.println("Error OUT " + ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Libro> listarTodos() {
        listaLibros = new ArrayList<Libro>();
        try{
            FileInputStream stream = new FileInputStream(new File("libros.txt"));
            
            ObjectInputStream lector = new ObjectInputStream(stream);
            listaLibros = (List<Libro>)lector.readObject();
            if(listaLibros == null)
                listaLibros = new ArrayList<Libro>();
            System.out.println("el tamaño de la lista es " + listaLibros.size());
            lector.close();
            stream.close();
        }catch(Exception ex){
            System.out.println("Error IN " + ex.getMessage());
        }
        return listaLibros;        
    }

    @Override
    public boolean actualizar(List<Libro> lista) {
        try{
            FileOutputStream stream = new FileOutputStream("libros.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(stream);
            escritor.writeObject(lista);
            escritor.close();
            stream.close();
            return true;
            
        }catch(Exception ex){
            System.out.println("Error OUT " + ex.getMessage());
        }
        return false;        
    }

    @Override
    public Libro buscar(String ISBN) {
        listaLibros = listarTodos();
        for (Libro libro : listaLibros) {
            if(libro.getISBN().equalsIgnoreCase(ISBN))
                return libro;
        }
        return null;
    }
}
