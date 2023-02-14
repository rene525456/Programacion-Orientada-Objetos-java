package accedosDatos;

import java.util.List;
import modelo.Editorial;


public interface IEditorialDao {
    public boolean save(Editorial editorial);
    public boolean update(Editorial editorial);
    public boolean delete(Editorial editorial);
    public List<Editorial> allEditoriales();
    public Editorial getEditorial(String nombre);
    
}
