/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accedosDatos;

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
public class ArchivoEditorial {
    public void guardar(Editorial editorial) {
        try {            
            List<Editorial> lista = leer();

            lista.add(editorial);

            FileOutputStream fos = new FileOutputStream("EmployeeList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(lista);
            System.out.println("Done");
            // closing resources
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Editorial> leer() {
        List<Editorial> lista = new ArrayList<Editorial>();
        try {
            FileInputStream fos1 = new FileInputStream("EmployeeList.txt");
            ObjectInputStream archivo = new ObjectInputStream(fos1);
            System.out.println("Lista de contactos:");
            lista = (List<Editorial>) archivo.readObject();
            if (lista == null) {
                lista = new ArrayList<Editorial>();
            }
            System.out.println(lista.size());
            
            archivo.close();
            fos1.close();

        } catch (Exception e) {
            e.getMessage();
        }
        return lista;
    }
}
