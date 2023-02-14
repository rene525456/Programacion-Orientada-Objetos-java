
package proyectoconversiones;

/**
 *
 * @author rene
 */
public class MasaCorporal {
    private double peso;
    private double altura;
    
    public double calcularMasaCorporal(double p, double a){
        double resultado = p / (a * a);
        return resultado;
        
        // solucion 2
        //return  p / (a * a);
    }
}
