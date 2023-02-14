package unl.chat;

import java.io.DataOutputStream;
import java.net.Socket;

public class Cliente implements Runnable{

    private int puerto;
    private String address = "127.0.0.1";
    private String mensaje;

    public Cliente(int puerto, String address, String mensaje) {
        this.puerto = puerto;
        this.address = address;
        this.mensaje = mensaje;
    }

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        DataOutputStream salida;
        try {
            Socket socket = new Socket(address, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF(mensaje);
            salida.close();
            socket.close();
        } catch (Exception e) {
        }
    }
    
}





