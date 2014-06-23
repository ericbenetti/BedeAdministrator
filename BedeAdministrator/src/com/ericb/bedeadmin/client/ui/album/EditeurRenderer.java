package com.ericb.bedeadmin.client.ui.album;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.ericb.bedeadmin.model.Editeur;

public class EditeurRenderer extends DefaultTableCellRenderer {

	private DateFormat df = new SimpleDateFormat("MM/yyyy");
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, ((Editeur) value).getLibelle(), isSelected, hasFocus,row, column);
		if (!isSelected) {
			setForeground(Color.orange);
		}
		
		return this;
	}

}
