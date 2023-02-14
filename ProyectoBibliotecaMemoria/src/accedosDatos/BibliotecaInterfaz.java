
package accedosDatos;

import modelo.Autor;
import modelo.Editorial;

public interface BibliotecaInterfaz {
    public boolean guardar(Editorial editorial);
    public boolean guardar(Autor autor);
}
