package com.ericb.bedeadmin.client.ui.album;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import sun.swing.table.DefaultTableCellHeaderRenderer;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.bedeadmin.server.dao.DBAction;

public class CursorRenderer extends DefaultTableCellHeaderRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, "", isSelected, hasFocus, row, column);

		
		switch ((DBAction)value) {
		case DELETE:
			setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/delete.png")));			
			break;
			
		case INSERT:
			setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/add.png")));			
			break;
			
		case UPDATE:
			setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/edit.png")));
			break;

		default:
			if (table.getSelectedRow()== row) {
				setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/arrow_right.png")));
			} else {
				setIcon(null);
			}
			
			break;
		}
		setBorder(BorderFactory.createLineBorder(getBackground()));
		return this;
	}
}
