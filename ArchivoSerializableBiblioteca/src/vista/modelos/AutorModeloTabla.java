/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Autor;

/**
 *
 * @author rene
 */
public class AutorModeloTabla extends AbstractTableModel{

    private List<Autor> lista;
    
    public AutorModeloTabla(List<Autor> lista) {
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
        Autor autor = getLista().get(i);
        switch (i1) {
            case 0:
                return autor.getDNI();
            case 1:
                return autor.getApellidos();
            case 2:
                return autor.getNombres();
            case 3:
                return autor.getNacionalidad();    
    
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "DNI";
            case 1: return "APELLIDOS";
            case 2: return "NOMBRES";
            case 3: return "NACIONALIDAD";
        }
        return null;
    } 
    
    public void eliminarAutor(int index){
        lista.remove(index);
        //fireTableDataChanged();
    }
    
    public List<Autor> getLista() {
        return lista;
    }
    
    
    
}
