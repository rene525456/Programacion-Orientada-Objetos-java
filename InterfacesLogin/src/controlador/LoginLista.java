/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author rene
 */
public class LoginLista implements ILogin{

    private List<Usuario> listaUsuario;
    
    public LoginLista(){
        listaUsuario = new ArrayList<Usuario>();
        cargarUsuario();
    }
    
    private void cargarUsuario(){
        Usuario angeline = new Usuario("angeline@unl.edu.ec", "angeline");
        Usuario karina = new Usuario("karina@unl.edu.ec", "karina");
        Usuario pedro = new Usuario("pedro@unl.edu.ec", "pedro");
        
        listaUsuario.add(angeline);
        listaUsuario.add(karina);
        listaUsuario.add(pedro);
    }
    
    public boolean autenticar(Usuario usuario) {
        for (Usuario u : listaUsuario) 
            if (u.getCorreo().equals(usuario.getCorreo())&& (u.getContrasena().equals(usuario.getContrasena())))
                return true;
        return false;
    }
    
}
