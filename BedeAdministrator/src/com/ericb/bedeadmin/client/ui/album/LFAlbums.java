package com.ericb.bedeadmin.client.ui.album;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.bedeadmin.model.Editeur;
import com.ericb.bedeadmin.model.FormatAlbum;
import com.ericb.bedeadmin.model.Genre;
import com.ericb.bedeadmin.model.Serie;
import com.ericb.mycomponents.JImagePanel;
import com.ericb.mycomponents.OnOffCellRenderer;

public class LFAlbums extends JFrame {

	private JTable table;
	private JTextField editFind = new JTextField();
	private JButton btnFind;
	
	//private AlbumEditor viewAlbum
		
	public LFAlbums(LFAlbumsControler controler) throws HeadlessException {
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
		
		this.table = new JTable(controler.getAlbumTableModel());
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
		
		JPanel panelFiche = new JPanel(new GridBagLayout());
		
		JImagePanel affiche = new JImagePanel();
		Dimension dim = new Dimension(144, 192);
		affiche.setPreferredSize(dim);
		affiche.setMinimumSize(dim);
		affiche.setMaximumSize(dim);
		affiche.setSize(dim);
		panelFiche.add(affiche, new GridBagConstraints(0, 0, 1, 7, .0, 1., GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(10,10,10,10), 0, 0));

		JComboBox<Serie> serie = new JComboBox<Serie>();
		panelFiche.add(serie, new GridBagConstraints(1, 0, 2, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(10,5,0,5), 0, 0));

		JTextField depotLegal = new JTextField();
		panelFiche.add(new JLabel("Dépot légal :"), new GridBagConstraints(3, 0, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(depotLegal, new GridBagConstraints(4, 0, 1, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
				
		JTextField tome = new JTextField();
		JTextField titre = new JTextField();
		JComboBox<Editeur> editeur = new JComboBox<Editeur>();
		panelFiche.add(tome, new GridBagConstraints(1, 1, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(titre, new GridBagConstraints(2, 1, 1, 1, 1.0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(new JLabel("Editeur :"), new GridBagConstraints(3, 1, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(editeur, new GridBagConstraints(4, 1, 1, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
				
		JComboBox<Genre> genre = new JComboBox<Genre>();
		JTextField collection = new JTextField();
		panelFiche.add(new JLabel("Style :"), new GridBagConstraints(1, 2, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(genre, new GridBagConstraints(2, 2, 1, 1, 1.0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(new JLabel("Collection :"), new GridBagConstraints(3, 2, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(collection, new GridBagConstraints(4, 2, 1, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
		
		JTextField cycle = new JTextField();
		JComboBox<FormatAlbum> format = new JComboBox<FormatAlbum>();
		panelFiche.add(new JLabel("Cycle :"), new GridBagConstraints(1, 3, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(cycle, new GridBagConstraints(2, 3, 1, 1, 1.0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,5), 0, 0));
		panelFiche.add(new JLabel("Format :"), new GridBagConstraints(3, 3, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(format, new GridBagConstraints(4, 3, 1, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
		
		JTree auteurs = new JTree();
		auteurs.setBackground(panelFiche.getBackground());
		JTextField isbn = new JTextField();
		JCheckBox editionOriginale = new JCheckBox("E.O.");
		JCheckBox horsSerie = new JCheckBox("Hors série");
		JCheckBox possede = new JCheckBox("Possédée");
		panelFiche.add(new JScrollPane(auteurs), new GridBagConstraints(1, 4, 2, 3, 1.0, 1.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5,5,10,5), 0, 0));
		panelFiche.add(new JLabel("ISBN :"), new GridBagConstraints(3, 4, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(isbn, new GridBagConstraints(4, 4, 1, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
		
		panelFiche.add(editionOriginale, new GridBagConstraints(3, 5, 1, 1, .0, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,0,5), 0, 0));
		panelFiche.add(horsSerie, new GridBagConstraints(4, 5, 2, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,5,0,10), 0, 0));
		panelFiche.add(possede, new GridBagConstraints(3, 6, 2, 1, .4, .0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5,50,10,10), 0, 0));
		
		
		
		
		this.add(panelFiche, BorderLayout.PAGE_END);
		
		
		
		
		
		this.setBounds(0, 0, 900, 400);
	}
	
	private void fixeColumnWidth(int colIndex, int fixedWidth) {
		table.getColumnModel().getColumn(colIndex).setMinWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setMaxWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setPreferredWidth(fixedWidth); 
		table.getColumnModel().getColumn(colIndex).setWidth(fixedWidth);
	}

}
