
package contactoarchivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactoArchivo {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Employee> lista = new ArrayList<Employee>();
        try {
             FileInputStream fos1 = new FileInputStream("employee.txt");
            ObjectInputStream archivo = new ObjectInputStream(fos1);
            System.out.println("Lista de contactos:");
            lista = (List<Employee>) archivo.readObject(); 
            if (lista == null)
                lista = new ArrayList<Employee>();
            else{
                System.out.println("siempre");
            }
            System.out.println(lista.size());
            archivo.close();
            fos1.close();
            
        } catch (Exception e) {
            System.out.println("wwwwwwwwwwwwww");
        }
        Employee emp = new Employee("Pankaj");

        emp.setAge(35);
        emp.setGender("Male");
        emp.setRole("CEO");
        System.out.println(emp);
        
        lista.add(emp);

        try {
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(lista);
            System.out.println("Done");
            // closing resources
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
