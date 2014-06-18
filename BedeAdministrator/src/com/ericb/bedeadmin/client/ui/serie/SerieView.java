package com.ericb.bedeadmin.client.ui.serie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.ericb.bedeadmin.model.Serie;


public class SerieView extends JPanel {


	private JLabel labelTitre;
	private JLabel labelStatut;
	private JLabel labelAlbumsCount;
	private JLabel labelGenre;

	private Serie serie;
	
	public SerieView(Serie serie) {
		initialize();
		setSerie(serie);
	}
		
	private void initialize() {
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 140));
		this.setPreferredSize(new Dimension(500, 140));
		
		Font titleFont = new Font("Oswald", Font.BOLD, 32);
		Font propertiesFont = new Font("Oswald", Font.PLAIN, 18);
		Font genreFont = new Font("Oswald", Font.PLAIN, 24);
		
		labelTitre = new JLabel("", SwingConstants.LEFT);
		labelTitre.setFont(titleFont);
		
		labelAlbumsCount = new JLabel("", SwingConstants.LEFT);
		labelAlbumsCount.setFont(propertiesFont);
		
		labelStatut = new JLabel("", SwingConstants.LEFT);
		labelStatut.setFont(propertiesFont);
		
		labelGenre = new JLabel("",  SwingConstants.LEFT);
		labelGenre.setFont(genreFont);
		labelGenre.setForeground(new Color(254, 120, 12));

		JPanel pContener = new JPanel();
		pContener.setLayout(new GridBagLayout());
		pContener.add(labelTitre, new GridBagConstraints(0, 0, 2, 1, 1.0, .0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
		pContener.add(labelGenre, new GridBagConstraints(0, 1, 2, 1, 1.0, .0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, new Insets(0, 10, 0, 10), 0, 0));

		pContener.add(labelStatut, new GridBagConstraints(0, 2, 1, 1, .5, .0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, new Insets(5, 10, 10, 0), 0, 0));
		pContener.add(labelAlbumsCount, new GridBagConstraints(1, 2, 1, 1, .5, .0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, new Insets(5, 10, 10, 10), 0, 0));
		pContener.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "INFORMATION SUR LA SERIE",  TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, this.getFont(), Color.gray));
		this.add(pContener, BorderLayout.CENTER);
	
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
		if (serie != null) {
			labelTitre.setText(serie.getTitre());
			labelAlbumsCount.setText("<html>" + serie.getNombreAlbumsPossedes() + " / <font Color=green><b>" + serie.getNombreAlbums() + "</b></font> albums</html>");
			labelStatut.setText("<html><font Color=green>" + 
			(!serie.isTerrmine()?"Série en cours":"Série terminée") +"</font> ("
			+ ((serie.getPremiereParution()!=null) ? serie.getPremiereParution().toString().split("-")[0]: "?")
			+ " - " 
			+ ((serie.getDerniereParution()!=null) ? serie.getDerniereParution().toString().split("-")[0]: "?")
			+ ")</html>");
			labelGenre.setText(serie.getGenre().toString());
		} else {
			labelTitre.setText("");
			labelAlbumsCount.setText("");
			labelStatut.setText("");
			labelGenre.setText("");
		}
	}




}
