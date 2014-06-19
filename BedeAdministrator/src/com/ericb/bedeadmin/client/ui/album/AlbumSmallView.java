package com.ericb.bedeadmin.client.ui.album;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.bedeadmin.model.Album;

public class AlbumSmallView extends JPanel {

	private JPanel pView;
	private JPanel pForm;

	private JLabel titre = new JLabel();
	private JLabel tome = new JLabel();
	private JLabel depotLegal = new JLabel();
	private JLabel labelDepotLegal = new JLabel("D�p�t l�gal :");
	private JLabel cycle = new JLabel();
	private JLabel isbn = new JLabel();
	private JLabel labelIsbn = new JLabel("ISBN :");
	private JLabel editeur = new JLabel();
	private JLabel labelEditeur = new JLabel("Editeur :");
	private JLabel scenario = new JLabel();
	private JLabel labelScenario = new JLabel("Sc�nario :");
	private JLabel dessin = new JLabel();
	private JLabel labelDessin = new JLabel("Dessin :");
	private JLabel couleur = new JLabel();
	private JLabel labelCouleur = new JLabel("Couleur :");
	private JLabel labelAutresInfo = new JLabel("Autres infos :");

	private JLabel premiereEdition = new JLabel();
	private JLabel horsSerie = new JLabel();
	private JLabel possede = new JLabel();
	private JLabel format = new JLabel();
	private JLabel labelFormat = new JLabel("Format :");


	private Album album;

	public AlbumSmallView(Album album) {
		this.setLayout(new GridBagLayout());
		this.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "INFORMATIONS SUR L'ALBUM", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));

		Font titleFont = new Font("Oswald", Font.BOLD, 24);
		Font tomeFont = new Font("Oswald", Font.PLAIN, 18);
		Font labelFont = new Font("Oswald", Font.ITALIC, 14);
		Font propertieFont = new Font("Oswald", Font.BOLD, 14);
		
		titre.setFont(titleFont);
		tome.setFont(tomeFont);
		scenario.setFont(propertieFont);
		labelScenario.setFont(labelFont);
		labelDessin.setFont(labelFont);
		dessin.setFont(propertieFont);
		labelCouleur.setFont(labelFont);
		couleur.setFont(propertieFont);
		labelDepotLegal.setFont(labelFont);
		depotLegal.setFont(propertieFont);
		labelIsbn.setFont(labelFont);
		isbn.setFont(propertieFont);
		labelEditeur.setFont(labelFont);
		editeur.setFont(propertieFont);
		labelAutresInfo.setFont(labelFont);
		horsSerie.setFont(propertieFont);
		labelFormat.setFont(labelFont);
		format.setFont(propertieFont);
		
		this.add(titre, new GridBagConstraints(0, 0, 4, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(10,10,5,10), 0, 0));
		this.add(tome, new GridBagConstraints(0, 1, 4, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,10,5,10), 0, 0));
		this.add(labelScenario, new GridBagConstraints(0, 2, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(scenario, new GridBagConstraints(1, 2, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelDessin, new GridBagConstraints(0, 3, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(dessin, new GridBagConstraints(1, 3, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelCouleur, new GridBagConstraints(0, 4, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(couleur, new GridBagConstraints(1, 4, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelDepotLegal, new GridBagConstraints(0, 5, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(depotLegal, new GridBagConstraints(1, 5, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelIsbn, new GridBagConstraints(0, 6, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(isbn, new GridBagConstraints(1, 6, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelEditeur, new GridBagConstraints(0, 7, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(editeur, new GridBagConstraints(1, 7, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelFormat, new GridBagConstraints(0, 8, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(format, new GridBagConstraints(1, 8, 3, 1, 1., 0., GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,10), 0, 0));
		this.add(labelAutresInfo, new GridBagConstraints(0, 9, 1, 1, .0, .0, GridBagConstraints.EAST, GridBagConstraints.EAST, new Insets(0,10,5,0), 0, 0));
		this.add(premiereEdition, new GridBagConstraints(2, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,5,5,0), 0, 0));
		this.add(horsSerie, new GridBagConstraints(1, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,5,5,0), 0, 0));
		this.add(possede, new GridBagConstraints(3, 9, 1, 1, .0, 0., GridBagConstraints.WEST, GridBagConstraints.WEST, new Insets(0,5,5,10), 0, 0));
		
		this.add(new JPanel(), new GridBagConstraints(0, 10, 4, 1, 1., 1.,  GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,10,0), 0, 0));

	}

	public void setAlbum(Album album) {
		if (album!=null) {
			titre.setText(album.getTitre());

			String htmlTome = "<html>";
			if (album.getCycle()!=null) {
				htmlTome += "<font Color=orange>" + album.getCycle() + "</font> - ";
			} 
			if (album.isHorsSerie()) {
				htmlTome += "HS";
			} else if (album.getNumero()!= null) {
				htmlTome += "<font Color=green>Tome " + album.getNumero() + "</font>";
			} 
			htmlTome += "</html>";

			tome.setText(htmlTome);

			scenario.setText(album.getScenario() );
			dessin.setText(album.getDessin());
			couleur.setText(album.getCouleur());
			
			depotLegal.setText(album.getDepotLegal().toString().split("-")[1] + "/" + album.getDepotLegal().toString().split("-")[0]);
			isbn.setText(album.getIsbn());
			editeur.setText(album.getEditeur().getLibelle());

			if (album.isPremiereEdition()){
				premiereEdition.setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/star_blue.png")));
			} else {
				premiereEdition.setIcon(null);
			}
			

			if (album.isHorsSerie()){
				horsSerie.setText("Hors Serie");
			} else {
				horsSerie.setText(null);
			}

			
			if (album.isPossede()){
				possede.setIcon(new ImageIcon(ClientApp.class.getResource("ui/icons/home.png")));
			} else {
				possede.setIcon(null);
			}

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
