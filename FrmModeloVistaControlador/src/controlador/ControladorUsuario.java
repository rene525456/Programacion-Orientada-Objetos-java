/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuario;

/**
 *
 * @author rene
 */
public class ControladorUsuario {
    
    public boolean autenticar(Usuario usuario){
        if (usuario.getCorreo().equals("poo@unl.edu.ec") && usuario.getContrasena().equals("123"))
            return true;
        else 
            return false;
    }
    
    public boolean autenticar(String correo, String password){
        return false;
    }
    
}
