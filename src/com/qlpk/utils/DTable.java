/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author fptshop
 */
public class DTable extends DefaultTableCellRenderer{

    
    @Override
    public Component getTableCellRendererComponent(
        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        setForeground(Color.BLACK);
        
        JTableHeader theader= table.getTableHeader();
        theader.setBackground(new java.awt.Color(9,227,250));

        
        if(table.getSelectedRow()==row){
            setBackground(new java.awt.Color(236,202,126));
        } else if(row%2==0){
           setBackground(Color.WHITE);
        } else{
           setBackground(new java.awt.Color(177,216,215));
        } 
       
        
        return this;
    }
    
}
