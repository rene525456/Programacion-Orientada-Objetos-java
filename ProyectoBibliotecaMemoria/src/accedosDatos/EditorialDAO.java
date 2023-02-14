
package accedosDatos;

import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Editorial;


public class EditorialDAO implements BibliotecaInterfaz{

    public static List<Editorial> lista;

    public EditorialDAO() {
        lista = new ArrayList<Editorial>();
    }
    
    
    
    @Override
    public boolean guardar(Editorial editorial) {
        lista.add(editorial);
        return true;
    }

    @Override
    public boolean guardar(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
