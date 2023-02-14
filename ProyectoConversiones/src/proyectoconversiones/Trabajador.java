package proyectoconversiones;

public class Trabajador {
    private int horasTrabajo;
    private double valorHoraTrabajada;
    
    public double calcularSueldo(int horas, double valor){
        double sueldo = 0;
        double sueldoExtra = 0;
        if(horas <= 40)
            sueldo = horas * valor;
        else {
            sueldo = 40 * valor;
            sueldoExtra = (horas - 40) * valor * 1.5;
            
        }

        return sueldo + sueldoExtra;  
    }
}
