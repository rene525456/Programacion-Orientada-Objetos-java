
package proyectopolimorfismooperaciones;


public class OperacionSuma extends OperacionPadre{

    public OperacionSuma() {
        super();
    }
    
    
    @Override
    public void operacion(){
        resultado = valor1 + valor2;
    }
    
}
