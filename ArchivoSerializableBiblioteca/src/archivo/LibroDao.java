/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package archivo;

import modelo.Libro;

/**
 *
 * @author rene
 */
public interface LibroDao extends ICRUD<Libro>{
    
    public Libro buscar (String ISBN);
}
