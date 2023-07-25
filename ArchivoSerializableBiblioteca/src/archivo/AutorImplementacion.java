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
import modelo.Editorial;
import modelo.Lector;
import modelo.Libro;

/**
 *
 * @author rene
 */
public class AutorImplementacion implements AutorDao{

    private List<Autor> listaAutores;
        
    @Override
    public boolean guardar(Autor autor) {
        try{
            List<Autor> lista = listarTodos();
            lista.add(autor);
            FileOutputStream stream = new FileOutputStream("Autores.txt");
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
    public List<Autor> listarTodos() {
        listaAutores = new ArrayList<Autor>();
        try{
            FileInputStream stream = new FileInputStream(new File("Autores.txt"));
            
            ObjectInputStream lector = new ObjectInputStream(stream);
            listaAutores = (List<Autor>)lector.readObject();
            if(listaAutores == null)
                listaAutores = new ArrayList<Autor>();
            System.out.println("el tamaño de la lista es " + listaAutores.size());
            lector.close();
            stream.close();
        }catch(Exception ex){
            System.out.println("Error IN " + ex.getMessage());
        }
        return listaAutores;        
    }
  
    
    
    @Override
    public Autor buscar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(List<Autor> lista) {
        try{
            FileOutputStream stream = new FileOutputStream("Autores.txt");
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


}
