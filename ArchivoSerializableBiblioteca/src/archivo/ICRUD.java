package archivo;

import java.util.List;

public interface ICRUD <T> {    
    public boolean guardar(T t); 
    public boolean actualizar(List<T> lista);
    public List<T> listarTodos();
}
