package com.ericb.bedeadmin.client.ui.album;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.ericb.bedeadmin.model.Album;

public class AlbumSmallView extends JPanel {

	private JPanel pView;
	private JPanel pForm;

	private JLabel titre = new JLabel();
	private JLabel tome = new JLabel();
	private JLabel depotLegal = new JLabel();
	private JLabel cycle = new JLabel();
	private JLabel isbn = new JLabel();
	private JLabel editeur = new JLabel();
	private JLabel scenario = new JLabel();
	private JLabel dessin = new JLabel();
	private JLabel couleur = new JLabel();
	private JLabel premiereEdition = new JLabel();
	private JLabel horsSerie = new JLabel();
	private JLabel possede = new JLabel();
	private JLabel format = new JLabel();

	private Album album;

	public AlbumSmallView(Album album) {
		this.setLayout(new GridBagLayout());
		this.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "INFORMATIONS SUR L'ALBUM", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		
		this.add(new JLabel("Titre :"), new GridBagConstraints(0, 0, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(10,10,5,0), 0, 0));
		this.add(titre, new GridBagConstraints(1, 0, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(10,0,5,10), 0, 0));
		
		this.add(new JLabel("Tome :"), new GridBagConstraints(0, 1, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(tome, new GridBagConstraints(1, 1, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JLabel("Texte :"), new GridBagConstraints(0, 2, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(scenario, new GridBagConstraints(1, 2, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
	
		this.add(new JLabel("Dessin :"), new GridBagConstraints(0, 3, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(dessin, new GridBagConstraints(1, 3, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
	
		this.add(new JLabel("Couleur :"), new GridBagConstraints(0, 4, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(couleur, new GridBagConstraints(1, 4, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JLabel("Editeur :"), new GridBagConstraints(0, 5, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(editeur, new GridBagConstraints(1, 5, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JLabel("ISBN :"), new GridBagConstraints(0, 6, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(isbn, new GridBagConstraints(1, 6, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));

		this.add(new JLabel("Cycle :"), new GridBagConstraints(0, 7, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(cycle, new GridBagConstraints(1, 7, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JLabel("Dépôt légal :"), new GridBagConstraints(0, 8, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(depotLegal, new GridBagConstraints(1, 8, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JLabel("Autres info :"), new GridBagConstraints(0, 9, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(premiereEdition, new GridBagConstraints(1, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,0,5,0), 0, 0));
		this.add(horsSerie, new GridBagConstraints(1, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,0,5,0), 0, 0));
		this.add(possede, new GridBagConstraints(1, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,0,5,10), 0, 0));
		
		this.add(new JPanel(), new GridBagConstraints(0, 10, 4, 1, 1., 1.,  GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,10,0), 0, 0));

	}

	public void setAlbum(Album album) {
		if (album!=null) {
			titre.setText(album.getTitre());
			tome.setText(album.getNumero());
			depotLegal.setText(album.getDepotLegal().toString());
			cycle.setText(album.getCycle());
			isbn.setText("");
			editeur.setText(album.getEditeur().getLibelle());
			scenario.setText("");
			dessin.setText("");
			couleur.setText("");
			premiereEdition.setText("" + album.isPremiereEdition());
			horsSerie.setText("" + album.isHorsSerie());
			possede.setText("" + album.isPossede());	
			format.setText(album.getFormat().toString());
		} else {
			titre.setText("");
			tome.setText("");
			depotLegal.setText("");
			cycle.setText("");
			isbn.setText("");
			editeur.setText("");
			scenario.setText("");
			dessin.setText("");
			couleur.setText("");
			premiereEdition.setText("");
			horsSerie.setText("");
			possede.setText("");	
			format.setText("");
		}
		
	}



}
