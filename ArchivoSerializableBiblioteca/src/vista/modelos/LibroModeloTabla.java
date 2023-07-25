package vista.modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author rene
 */
public class LibroModeloTabla extends AbstractTableModel{

    private List<Libro> lista;
    
    public LibroModeloTabla(List<Libro> lista) {
        super();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Libro libro = getLista().get(i);
        switch (i1) {
            case 0:
                return libro.getISBN();
            case 1:
                return libro.getTitulo();
            case 2:
                return libro.getAnio();
            
    
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ISBN";
            case 1: return "Título";
            case 2: return "Año";
            
        }
        return null;
    } 
    
    public List<Libro> getLista() {
        return lista;
    }
}

