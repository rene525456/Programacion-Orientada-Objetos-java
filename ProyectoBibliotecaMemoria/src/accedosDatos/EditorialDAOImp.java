package accedosDatos;

import java.util.ArrayList;
import java.util.List;
import modelo.Editorial;

public class EditorialDAOImp implements IEditorialDao{

    List<Editorial> listaClientes;

    public EditorialDAOImp() {
        listaClientes = new ArrayList<Editorial>();
        cargarDatos();
    }
    
    @Override
    public boolean save(Editorial editorial) {
        listaClientes.add(editorial);
        return true;
    }

    @Override
    public boolean update(Editorial editorial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Editorial editorial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Editorial> allEditoriales() {
        return listaClientes;
    }

    @Override
    public Editorial getEditorial(String nombre) {
        for (Editorial editorial : listaClientes) {
            if (editorial.getNombre().equals(nombre))
                return editorial;
        }
        return null;
    }
    
    private void cargarDatos(){
        listaClientes.add(new Editorial("Prisma", "Bogota", "calle 1 y 2da"));
        listaClientes.add(new Editorial("Atalanta", "Mexico", "en el centro"));
        listaClientes.add(new Editorial("Satori", "Los Angeles", "barrio del sur"));
    }    
}
