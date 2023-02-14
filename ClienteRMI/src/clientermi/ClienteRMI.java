package clientermi;

import java.rmi.Naming;
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 

public class ClienteRMI {

    public ClienteRMI (){
            try{
                
                Registry myRegistro = LocateRegistry.getRegistry("localhost",1234);
                
                servidorrmi.ServidorInterface interfaz = (servidorrmi.ServidorInterface) myRegistro.lookup("servicio");
                System.out.println(interfaz.buscar(1).getNombre());
                
            }catch(Exception ex){
                    System.out.println(ex);
            }
    }

    public static void main (String [] args){
            new ClienteRMI();
    }
    
    
    
    
}
