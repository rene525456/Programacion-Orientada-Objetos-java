
package conversiones;

/**
 *
 * @author rene
 */
public class Persona {
    public int edad;
    
    public void verifarEdad(int e){
        /*if (e >= 18)
            System.out.println("Es mayor de edad");
        else 
            System.out.println("Es menor de edad");
          */
        String mensaje = (e >= 18) ? "Es mayour de edad" : "Es menor de edad";
        System.out.println(mensaje);
    }
}
