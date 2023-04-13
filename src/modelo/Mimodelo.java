/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dam
 */
public class Mimodelo extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        boolean resultado = true;
        if (column == 0) {
            resultado = false;
        }
        return resultado;
    }

}
