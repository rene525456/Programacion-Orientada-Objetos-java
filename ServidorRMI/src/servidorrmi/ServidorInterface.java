
package servidorrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServidorInterface extends Remote {
    
    public Persona buscar(int id) throws RemoteException;
    
}
