/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Editorial;
import modelo.Libro;

/**
 *
 * @author rene
 */
public class EditorialModeloTabla extends AbstractTableModel{

    private List<Editorial> lista;
    
    public EditorialModeloTabla(List<Editorial> lista) {
        super();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Editorial editorial = getLista().get(i);
        switch (i1) {
            case 0:
                return editorial.getNombre();
            case 1:
                return editorial.getCiudad();
            
            
    
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Nombre";
            case 1: return "Ciudad";
        }
        return null;
    } 
    
    public List<Editorial> getLista() {
        return lista;
    }
}


