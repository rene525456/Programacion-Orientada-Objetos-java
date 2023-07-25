
package herenciabebida;

import controlador.Almacen;
import modelo.AguaMineral;
import modelo.Bebida;
import modelo.BebidaAzucarada;

public class HerenciaBebida {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Bebida bebida;
        
        bebida = new Bebida(1, 1.5, 2, "pepsi");
        almacen.agregarBebida(bebida);
        bebida = new AguaMineral(2, 0.5, 1.00, "vilca agua", false);
        almacen.agregarBebida(bebida);
        bebida = new AguaMineral(3, 1.0, 2.00, "vilca agua", true);
        almacen.agregarBebida(bebida);
        bebida = new BebidaAzucarada(4, 0.30, 3.00, "pepsi", true, 0); 
        almacen.agregarBebida(bebida);
        bebida = new BebidaAzucarada(5, 1.00, 1.50, "Pepsi", false, 0); 
        almacen.agregarBebida(bebida);
        almacen.mostrarBebidas();
        System.out.println("Precio Total " + almacen.calcularPrecioBebidas());
        System.out.println("Precio Total Pepsi " + almacen.calcularPrecioPorMarcas("pepsi")); 
    }
}
