package com.ericb.bedeadmin.client.ui.album;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.mycomponents.OnOffCellRenderer;

public class LFAlbums extends JFrame {

	private JTable table;
	private JTextField editFind = new JTextField();
	private JButton btnFind;
	
	//private AlbumEditor viewAlbum
		
	public LFAlbums(LFAlbumsControler controler,AlbumTableModel model) throws HeadlessException {
		super("Minimal-Frame-Application");
		setTitle("Les albums");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnFind = new JButton(new ImageIcon(ClientApp.class.getResource("ui/icons/magnify.png")));
		btnFind.addActionListener(controler);
		
		editFind = new JTextField();
		editFind.setMinimumSize(new Dimension(200,20));
		editFind.setMaximumSize(new Dimension(300,20));
		editFind.setPreferredSize(new Dimension(250,20));
		editFind.setSize(new Dimension(250,20));		
			
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.add(editFind);
		toolBar.add(btnFind);
		toolBar.add(Box.createHorizontalGlue());
		
		this.add(toolBar, BorderLayout.PAGE_START);
		
		this.table = new JTable(model);
		table.setShowGrid(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		
		fixeColumnWidth(0, 30); 
		fixeColumnWidth(2, 30); 
		fixeColumnWidth(3, 30); 
		fixeColumnWidth(4, 80); 
		fixeColumnWidth(5, 180); 
		table.getColumnModel().getColumn(0).setCellRenderer(new CursorRenderer());

		table.getColumnModel().getColumn(2).setCellRenderer(new OnOffCellRenderer(new ImageIcon(ClientApp.class.getResource("ui/icons/star_yellow.png")), null));

		ImageIcon on = new ImageIcon(ClientApp.class.getResource("ui/icons/bullet_green.png"));
		ImageIcon off = new ImageIcon(ClientApp.class.getResource("ui/icons/bullet_red.png"));
		table.getColumnModel().getColumn(3).setCellRenderer(new OnOffCellRenderer(on, off));
	
		table.getColumnModel().getColumn(4).setCellRenderer(new DLRenderer());
		table.getColumnModel().getColumn(5).setCellRenderer(new EditeurRenderer());

		JPanel panelTable = new JPanel(new BorderLayout());
		panelTable.add(table.getTableHeader(), BorderLayout.PAGE_START);
		panelTable.add(new JScrollPane(table), BorderLayout.CENTER);
		
		this.add(panelTable, BorderLayout.CENTER);
		
		this.setBounds(0, 0, 900, 400);
	}
	
	private void fixeColumnWidth(int colIndex, int fixedWidth) {
		table.getColumnModel().getColumn(colIndex).setMinWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setMaxWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setPreferredWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setWidth(fixedWidth);
	}

}
