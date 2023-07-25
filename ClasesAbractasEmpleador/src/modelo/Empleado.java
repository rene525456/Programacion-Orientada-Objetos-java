package modelo;

public abstract class Empleado {
    
    public String nombre;
    private int edad;   // métodos getter y setter
    protected double salario;  // acceso por jerarquias
    
    public final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + " edad = " + edad + " salario = " + salario;
    }

    public abstract boolean aumentarSalario();
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
