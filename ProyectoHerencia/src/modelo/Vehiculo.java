
package modelo;


public class Vehiculo {
    public String marca;
    private double precio;
    private String matricula;

    public Vehiculo() {
    }

    public Vehiculo(String marca, double precio, String matricula) {
        this.marca = marca;
        this.precio = precio;
        this.matricula = matricula;
    }
    
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    
    public void acelerar (){
        System.out.println("Estoy acelerando");
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
    
}
