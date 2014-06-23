package com.ericb.bedeadmin.client.ui.album;

import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class DLRenderer extends DefaultTableCellRenderer {

	private DateFormat df = new SimpleDateFormat("MM/yyyy");
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, df.format((Date) value), isSelected, hasFocus,row, column);
		setHorizontalAlignment(SwingConstants.CENTER);
		return this;
	}

}
