package modelo;

public class Autor extends Persona {
    
    private String profesión;

    public Autor(String profesión, String DNI, String nombres, String apellidos, String nacionalidad) {
        super(DNI, nombres, apellidos, nacionalidad);
        this.profesión = profesión;
    }

    @Override
    public String toString() {
        return "Autor = " + getDNI() + " - " + getApellidos() + "  " + getNombres(); 
    }   

    /**
     * @return the profesión
     */
    public String getProfesión() {
        return profesión;
    }

    /**
     * @param profesión the profesión to set
     */
    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }
    
    
}