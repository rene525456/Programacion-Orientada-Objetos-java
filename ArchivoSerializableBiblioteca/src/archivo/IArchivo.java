/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package archivo;

import modelo.Autor;
import modelo.Editorial;
import modelo.Lector;
import modelo.Libro;

/**
 *
 * @author rene
 */
public interface IArchivo {
    public boolean guardar(Lector lector);
    public boolean guardar(Editorial editorial);
    public boolean guardar(Autor autor);
    public boolean guardar(Libro libro);
}
