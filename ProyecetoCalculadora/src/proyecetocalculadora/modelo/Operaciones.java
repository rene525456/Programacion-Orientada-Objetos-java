
package proyecetocalculadora.modelo;

/**
 * @author rene
 * clase que permite detallara operaciones basicas como sumas y restas
 */

public class Operaciones {
    // zona de atributos
    private double a;  // valor por defecto 0
    private double b;
    
    public double sumar(double x, double y){
        double resultado = x + y;
        return resultado;
    }
    
    public double restar(double x, double y){
        return x - y;
    }
}    
