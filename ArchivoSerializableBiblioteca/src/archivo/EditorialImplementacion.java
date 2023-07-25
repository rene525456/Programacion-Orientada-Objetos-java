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
import modelo.Editorial;

/**
 *
 * @author rene
 */
public class EditorialImplementacion implements EditorialDao{

    private List<Editorial> lista;
    
    @Override
    public boolean guardar(Editorial editorial) {
        try{
            List<Editorial> lista = listarTodos();
            lista.add(editorial);
            FileOutputStream stream = new FileOutputStream("editorial.txt");
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
    public List<Editorial> listarTodos() {
        lista = new ArrayList<Editorial>();
        try{
            FileInputStream stream = new FileInputStream(new File("editorial.txt"));
            
            ObjectInputStream lector = new ObjectInputStream(stream);
            lista = (List<Editorial>)lector.readObject();
            if(lista == null)
                lista = new ArrayList<Editorial>();
            System.out.println("el tamaño de la lista es " + lista.size());
            lector.close();
            stream.close();
        }catch(Exception ex){
            System.out.println("Error IN " + ex.getMessage());
        }
        return lista;        
    }
    
    @Override
    public boolean actualizar(List<Editorial> lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
