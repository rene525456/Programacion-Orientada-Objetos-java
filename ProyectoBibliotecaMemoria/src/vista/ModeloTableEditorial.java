package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Editorial;

public class ModeloTableEditorial extends AbstractTableModel{

    private List<Editorial> listaEditorial;
    
    private final Class[] tipoColumnas;
    private final String[] titleColumnas ;

    public ModeloTableEditorial() {
        listaEditorial = new ArrayList();
        this.titleColumnas = new String[]{"Nombre", "Ciudad", "Direccion"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class};
    }

    @Override
    public String getColumnName(int column) {
        return titleColumnas[column];
    }
    
    
    @Override
    public int getRowCount() {
        return listaEditorial.size();
    }

    @Override
    public int getColumnCount() {
        return titleColumnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0: return listaEditorial.get(i).getNombre();
            case 1: return listaEditorial.get(i).getCiudad();
            case 2: return listaEditorial.get(i).getDireccion();
            default:
                return null;
        }
    }

    /**
     * @return the listaEditorial
     */
    public List<Editorial> getListaEditorial() {
        return listaEditorial;
    }

    /**
     * @param listaEditorial the listaEditorial to set
     */
    public void setListaEditorial(List<Editorial> listaEditorial) {
        this.listaEditorial = listaEditorial;
    }

    
    
}
