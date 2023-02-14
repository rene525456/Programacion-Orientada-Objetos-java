
package proyectoconversiones;

import java.util.Scanner;

/**
 *
 * @author rene
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int numero2 = lector.nextInt();
        System.out.println("Ingrese el numero 3: ");
        int numero3 = lector.nextInt();
        
        Mayores mayores = new Mayores();
        int mayor = mayores.obtenerMayorTresNumeros(numero1, numero2, numero3);
        System.out.println("El numero mayor es: " + mayor);
        
//        int horas = lector.nextInt();
//        System.out.println("Ingrese el valor a pagar en cada hora: ");
//        double valor = lector.nextDouble();
//        
//        Trabajador trabajador = new Trabajador();
//        double resultado = trabajador.calcularSueldo(horas, valor);
//        System.out.println("El sueldo del trabajador es; " + resultado);
        
        //solucion    1
//        System.out.println("Por favor ingres la velocidad");
//        Scanner lector = new Scanner(System.in);
//        double entrada = lector.nextDouble();
//        ConversionesDistancia conversion = new ConversionesDistancia();
//        double resultado = conversion.convertirKmMetros(entrada);
//        System.out.println("el la conversion es " + resultado);
        
        //solucion  
//        System.out.println("Por favor ingres la velocidad");
//        Scanner lector = new Scanner(System.in);
//        double entrada = lector.nextDouble();
//        ConversionesDistancia conversion = new ConversionesDistancia();
//        System.out.println("el la conversion es " + conversion.convertirKmMetros(entrada));
//        Scanner lector = new Scanner(System.in);
//        System.out.println("Ingrese el peso:");
//        double peso = lector.nextDouble();
//        System.out.println("Ingrese al altura:");
//        double altura = lector.nextDouble();
//        
//        MasaCorporal masa = new MasaCorporal();
//        double resultado = masa.calcularMasaCorporal(peso, altura);
//        System.out.println("La masa corporal es " + resultado);

    }
    
}
















