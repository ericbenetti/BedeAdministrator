
package com.ericb.bedeadmin.client.ui.serie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.bedeadmin.client.ui.album.AlbumListRenderer;
import com.ericb.bedeadmin.client.ui.album.AlbumSmallView;
import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.model.Serie;

public class LFSerie extends JFrame{

	private final String PATH_RESOURCE = "ui/icons/";
	//private JMenuBar menuBar = new JMenuBar() ;
	private JToolBar toolBar; 
	private JSplitPane split;
	private JList<Serie> listeSerie;
	private JList<Album> listeAlbum;
	private SerieView viewSerie;
	private AlbumSmallView viewAlbum;
	private JProgressBar progressBar;
	private JLabel progressLabel;

	private LFSerieControler controler;

	public LFSerie (LFSerieControler controler, DefaultListModel<Serie> lmSerie, Serie serie, DefaultListModel<Album> lmAlbum) {
		super("Minimal-Frame-Application");
		this.controler = controler;
		this.setTitle("The collector");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);

		listeSerie = new JList<Serie>(lmSerie);
		listeSerie.setCellRenderer(new SerieListRenderer());
		listeSerie.addListSelectionListener(controler);

		progressBar = new JProgressBar();
		
		listeAlbum = new JList<Album>(lmAlbum);
		listeAlbum.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listeAlbum.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listeAlbum.setLayout(new GridLayout());
		listeAlbum.setFixedCellWidth(154);
		listeAlbum.setFixedCellHeight(222);
		listeAlbum.setVisibleRowCount(2);
		listeAlbum.setCellRenderer(new AlbumListRenderer(ClientApp.STATIC_PROPERTIES.getProperty("bdgest.path")));
		listeAlbum.addListSelectionListener(controler);
		listeAlbum.setBorder(BorderFactory.createEmptyBorder());
		
		JPanel panelListe = new JPanel(new BorderLayout());
		panelListe.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panelListe.add(new JScrollPane(listeSerie), BorderLayout.CENTER);
		panelListe.add(progressBar, BorderLayout.PAGE_END);

		viewSerie = new SerieView(null);
		viewAlbum = new AlbumSmallView(null);
		viewAlbum.setMinimumSize(new Dimension(360, 400));
		viewAlbum.setPreferredSize(new Dimension(360, 400));
		viewAlbum.setSize(new Dimension(360, 400));

		JPanel panelHeaderFiche = new JPanel(new BorderLayout());
		panelHeaderFiche.add(viewSerie);
		JPanel panelFiche = new JPanel(new BorderLayout());
		panelFiche.add(panelHeaderFiche, BorderLayout.PAGE_START);
		
		JPanel panelListeAlbum = new JPanel(new BorderLayout());
		panelListeAlbum.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "INFORMATIONS SUR L'ALBUM", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		
		panelListeAlbum.add(new JScrollPane(listeAlbum), BorderLayout.CENTER);
		panelFiche.add(viewAlbum, BorderLayout.LINE_END);
		panelFiche.add(panelListeAlbum, BorderLayout.CENTER);

		toolBar = new JToolBar();
		toolBar.add(Box.createHorizontalGlue());
		addToolBarButton(toolBar, "power_off.png", LFSerieControler.EXIT_APPLICATION, null, "Quitter");

		split = new JSplitPane (JSplitPane.HORIZONTAL_SPLIT, panelListe, panelFiche);

		this.add(toolBar, BorderLayout.PAGE_END);
		this.add(split, BorderLayout.CENTER);
	}
	
	public JList<Serie> getListeSerie() {
		return listeSerie;
	}

	public JList<Album> getListeAlbum() {
		return listeAlbum;
	}

	protected void addToolBarButton(JToolBar tb, String imageName, String actionCommand, String toolTipText, String altText) {

		JButton button = new JButton();
		button.setActionCommand(actionCommand);
		button.setToolTipText(toolTipText);
		button.addActionListener(this.controler);

		if (imageName != null) {                      
			button.setIcon(new ImageIcon(ClientApp.class.getResource(PATH_RESOURCE  + imageName), altText));
			button.setText(altText);
		} else {                                    
			button.setText(altText);
		}

		tb.add(button); 
	}


	public SerieView getViewSerie() {
		return viewSerie;
	}

	public AlbumSmallView getViewAlbum() {
		return viewAlbum;
	}


	public JProgressBar getProgressBar() {
		return progressBar;
	}


	public JLabel getProgressLabel() {
		return progressLabel;
	}


}
