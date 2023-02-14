
package servidorrmi;

import java.rmi.Naming;
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 

public class Servidor {
    
    public Servidor(){
        try{		
            Registry miRegistro = LocateRegistry.createRegistry(1234);
            ServidorInterface servidor = new ServidorImplementacion();
            miRegistro.rebind("servicio", servidor);
                System.out.println("Estamos en el servidor");

        }catch(Exception ex){
           // soat
        }
    }
	
    public static void main (String [] args){
            new Servidor();
    }
    
}
