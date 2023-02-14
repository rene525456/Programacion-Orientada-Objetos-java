/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author rene
 */
public class CtrUsuario {
    
    List<Usuario> lista = new ArrayList<>();

    public CtrUsuario() {
        lista.add(new Usuario("rene", "rene", true, Rol.Administrador));
        lista.add(new Usuario("angeline", "ronaldo", true, Rol.Biblioterario));
    }
    
    
    
    public boolean verficarUsuiario(String user, String password){
        for (Usuario usuario : lista) 
            if (usuario.getUser().equals(user) && usuario.getPassword().equals(password))
                return true;
        return false;
    }
}
