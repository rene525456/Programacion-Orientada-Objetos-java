package unl.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;


public class Servidor extends Observable implements Runnable{

    private int puerto;

    public Servidor( int puerto) {
        this.puerto = puerto;
    }
   
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        
        DataInputStream entrada;
        try{
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor inicializado");
            while(true){
                socket = servidor.accept();
                System.out.println("cliente aceptado");
                entrada = new DataInputStream(socket.getInputStream());
                String mensaje = entrada.readUTF();
                System.out.println("mensaje receptado " + mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                entrada.close();
                socket.close();
                System.out.println("cliente desconectado");
            }
            
        }catch(IOException ex){
            
        }
                
    }
}





