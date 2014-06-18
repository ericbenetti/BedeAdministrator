package com.ericb.bedeadmin.client.ui.album;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import com.ericb.bedeadmin.model.Album;
import com.ericb.mycomponents.JImagePanel;

public class AlbumListRenderer extends JPanel implements ListCellRenderer<Album> {

	private JPanel pnl_conteneur ;
	private JImagePanel pnl_couverture;
	private JLabel lbl_titre;
	private JLabel lbl_vue;
	private String  imageRootPath;
	
	public AlbumListRenderer(String imageRootPath) {
		this.imageRootPath = imageRootPath;
		this.setLayout(new GridBagLayout());
		
		Dimension dim = new Dimension(144, 192);
		
		pnl_couverture = new JImagePanel();
		pnl_couverture.setPreferredSize(dim);
		pnl_couverture.setMinimumSize(dim);
		pnl_couverture.setMaximumSize(dim);
		pnl_couverture.setSize(dim);
		//lbl_vue  = new JLabel(new ImageIcon(getClass().getResource("/com/orou_eben/common/icons/warning24.png")));
		//pnl_couverture.add(lbl_vue);
		
		//pnl_couverture.add(lbl_vue);
		lbl_titre = new JLabel();
		lbl_titre.setAlignmentX(CENTER_ALIGNMENT);
		this.add(pnl_couverture, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5,5,2,5), 0, 0));
		this.add(lbl_titre, new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0,5,5,5), 0, 0));
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Album> list, Album value, int index, boolean isSelected, boolean cellHasFocus) {
		pnl_couverture.setImage(new ImageIcon(imageRootPath + value.getCouverture()).getImage());
		String htmlTitle = "<html>";
		if (value.getNumero()!=null) {
			htmlTitle += "<b>" + ((value.isHorsSerie())? "HS " : "") + value.getNumero().trim() + "</b> - ";
		}
		htmlTitle += value.getTitre();
		htmlTitle += "</html>";
		lbl_titre.setText(htmlTitle);
		lbl_titre.setForeground(Color.white);	
		//lbl_vue.setVisible(!value.isPossede());		
		return this;
	}
}
