package servidorrmi;

import java.rmi.RemoteException;


import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorImplementacion extends UnicastRemoteObject implements ServidorInterface{
    
    private ArrayList<Persona> lista;
    
    public ServidorImplementacion () throws RemoteException {		
        super();    
        cargarLista();
    }
    
    private void cargarLista(){
        lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Rene", "docente", 1400));
        lista.add(new Persona(2, "Karina", "docente", 700));
        lista.add(new Persona(3, "Edwin", "programador", 800));
        lista.add(new Persona(4, "Patricia", "contadora", 800));
    }
    
    @Override
    public Persona buscar(int id) throws RemoteException {
        for (Persona persona : lista) {
            if (persona.getId() == id)
                return persona;
        }
        return null;
    }
    
}
