package com.ericb.bedeadmin.client.ui.serie;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;

import com.ericb.bedeadmin.client.ClientApp;
import com.ericb.bedeadmin.model.OneShot;
import com.ericb.bedeadmin.model.Serie;


public class SerieListRenderer implements ListCellRenderer<Serie> {

	private JPanel pnl_conteneur;
	private JLabel lbl_titre;
	private JLabel lbl_parution;
	private JLabel lbl_statut;
	
	public SerieListRenderer() {
		pnl_conteneur = new JPanel(new GridBagLayout());

		lbl_titre = new JLabel();
		lbl_titre.setFont(new Font("Oswald", Font.PLAIN, 14));
		lbl_titre.setForeground(Color.black);
		lbl_parution = new JLabel();
		lbl_parution.setFont(new Font("Oswald", Font.PLAIN, 12));
		lbl_parution.setForeground(new Color(254, 120, 12));
		
		lbl_statut  = new JLabel(new ImageIcon(ClientApp.class.getResource("ui/icons/warning.png")));
		
		pnl_conteneur.add(lbl_titre, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.LINE_START, GridBagConstraints.BOTH, new Insets(0, 5, 0, 5), 0, 0));
		pnl_conteneur.add(lbl_parution, new GridBagConstraints(0, 1, 1, 1, 1.0, .0, GridBagConstraints.LINE_START, GridBagConstraints.BOTH, new Insets(0, 5, 0, 5), 0, 0));
		pnl_conteneur.add(lbl_statut, new GridBagConstraints(1, 1, 1, 1, .0, .0, GridBagConstraints.LINE_START, GridBagConstraints.BOTH, new Insets(0, 5, 0, 5), 0, 0));
		
		pnl_conteneur.add(new JSeparator(), new GridBagConstraints(0, 2, 1, 1, 1.0, .0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, new Insets(5, 25, 0, 25), 0, 0));
	}
	
	
	@Override
	public Component getListCellRendererComponent(JList<? extends Serie> list, Serie value, int index, boolean isSelected, boolean cellHasFocus) {
		// TODO Auto-generated method stub
		lbl_titre.setText(value.getTitre());

		if(value.getClass().equals(OneShot.class) ) {
			lbl_parution.setText("One shot");
			lbl_parution.setForeground(Color.orange);
		} else if (value.isTerrmine()) {
			lbl_parution.setText("Série terminée");
			lbl_parution.setForeground(Color.red);
			lbl_parution.setForeground(new Color(223, 1, 1));
			
		} else {
			lbl_parution.setText("Série en cours");
			lbl_parution.setForeground(new Color(4,180,4));
		}

		ImageIcon icon;
		if (value.estSerieComplete()) {
			icon = new ImageIcon(ClientApp.class.getResource("ui/icons/check.png"));
		} else {
			icon = new ImageIcon(ClientApp.class.getResource("ui/icons/warning.png"));
		}
		lbl_statut.setIcon(icon);

		if (isSelected) {
			//pnl_conteneur.setBackground(new Color(88, 130, 250));
			pnl_conteneur.setBackground(list.getSelectionBackground());
		} else {
			pnl_conteneur.setBackground(list.getBackground());
		}
			lbl_titre.setForeground(Color.white);

		return pnl_conteneur;
	}
	
	

}
