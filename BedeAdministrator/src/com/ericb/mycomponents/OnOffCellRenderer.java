package com.ericb.mycomponents;

import java.awt.Component;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class OnOffCellRenderer extends  DefaultTableCellRenderer {

	private ImageIcon on;
	private ImageIcon off;

	public OnOffCellRenderer(ImageIcon on, ImageIcon off) {
		super();
		this.on = on;
		this.off = off;
	}


	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, null, isSelected, hasFocus,row, column);
		if ((boolean) value) {
			setIcon(on);
		} else {
			setIcon(off);
		}
		setHorizontalAlignment(SwingConstants.CENTER);
		return this;
	}

}
