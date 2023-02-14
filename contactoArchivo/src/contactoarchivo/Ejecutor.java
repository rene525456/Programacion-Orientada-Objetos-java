package contactoarchivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ejecutor {

    public static void main(String[] args) {
        Employee e = new Employee("rene");
        e.setAge(2);
        e.setGender("Femenino");
        e.setRole("xxxx");
        ArchivoContactos ac = new ArchivoContactos();
        ac.guardar(e);
    }
}
