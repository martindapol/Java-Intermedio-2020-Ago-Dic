/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gui;

import com.example.dominio.Correo;
import com.example.servicios.GestorCorreo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MARTIN
 */
public class CorreoTableModel extends AbstractTableModel {

    private GestorCorreo gestor;
    private static final int COLS = 4;
    private static final String COL_NAMES[]={"Asunto", "Cuerpo", "Fecha", "From"};
    
    
    public CorreoTableModel(GestorCorreo gestor) {
        this.gestor = gestor;
    }

    @Override
    public int getRowCount() {
        return gestor.inBox().size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int i) {
        return COL_NAMES[i];
    }
    

    @Override
    public Object getValueAt(int row, int col) {
        List<Correo> data = gestor.inBox();
        Object aux = null;

        if (row < data.size()) {
            Correo oCorreo = data.get(row);

            switch (col) {
                case 0:
                    aux = oCorreo.getAsunto();
                    break;
                case 1:
                    aux = oCorreo.getCuerpo();
                    break;
                case 2:
                    aux = oCorreo.getFecha();
                    break;
                case 3:
                    aux = oCorreo.getRemitente();
                    break;
                default:
                    aux = null;
            }

        }
        return aux;
    }   

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    public void filtrarFilas(String asunto) {
        //TODO: para que lo cierren ustedes!!!!
        //un éxito!
    }

}
