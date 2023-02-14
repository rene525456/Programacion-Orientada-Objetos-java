package contactoarchivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoContactos {

    public ArchivoContactos() {
        
    }
    
    public void guardar(Employee employee) {
        try {            
            List<Employee> lista = getLista();

            lista.add(employee);

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

    public List<Employee> getLista() {
        List<Employee> lista = new ArrayList<Employee>();
        try {
            FileInputStream fos1 = new FileInputStream("EmployeeList.txt");
            ObjectInputStream archivo = new ObjectInputStream(fos1);
            System.out.println("Lista de contactos:");
            lista = (List<Employee>) archivo.readObject();
            if (lista == null) {
                lista = new ArrayList<Employee>();
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
