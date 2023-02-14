package proyectopolimorfismo;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        this.altaContrato = calendario.getTime();
    }
    
    public Empleado (String nombre){
        this(nombre, 450,2022, 12,7);
    }

    public abstract void subirSueldo(int porcentaje);
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the altaContrato
     */
    public Date getAltaContrato() {
        return altaContrato;
    }

    /**
     * @param altaContrato the altaContrato to set
     */
    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }
    
    
    
    
}
