
package modelo;

public class Matematicas {

    public static double PI = 0;
    
    public static int convertirCadenasNumero(String cadena){
        return Integer.parseInt(cadena);
    }
    
    public static double calcularAreaCirculo(double radio){
        return PI * radio * radio;
    }
    
}
