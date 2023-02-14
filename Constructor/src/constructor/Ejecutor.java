package constructor;

import java.util.Date;
import modelo.Autor;

public class Ejecutor {

    public static void main(String[] args) {
        Autor a1 = new Autor();
        a1.imprimirDatos();
        
        Autor a2 = new Autor("rene", "11049378", new Date());
        a2.imprimirDatos();
    }
    
}
