
package modelo;

import java.util.Date;


public class Autor {
    private String nombre; // null por defecto
    private String cedula; // null por defecto
    private Date fecha; // null por defecto

    public Autor() {
        //cedula = "1104097553";
    }

    public Autor(String nombre, String cedula, Date fecha) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
    }
    
    
    
    
    
    public void imprimirDatos(){
        System.out.println(nombre + " " + cedula + " " + fecha);
    }
    
}
