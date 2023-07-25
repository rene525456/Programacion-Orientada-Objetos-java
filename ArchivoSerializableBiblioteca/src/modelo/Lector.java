package modelo;

public class Lector extends Persona{
    
    private String correo;
    private String telefono;

    public Lector(String correo, String telefono, String DNI, String nombres, String apellidos, String nacionalidad) {
        super(DNI, nombres, apellidos, nacionalidad);
        this.correo = correo;
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Lector - " + getDNI() + " " + getApellidos() + " " + getNombres() + " " + getCorreo(); 
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
