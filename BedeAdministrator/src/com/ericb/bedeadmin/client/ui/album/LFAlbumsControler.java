package com.ericb.bedeadmin.client.ui.album;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;

import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.model.Editeur;
import com.ericb.bedeadmin.model.Genre;
import com.ericb.bedeadmin.model.Serie;
import com.ericb.bedeadmin.server.BedeAdministrator;

public class LFAlbumsControler  implements ActionListener{
	
	private LFAlbums view;
	private AlbumTableModel albumTableModel;
	private ComboBoxModel<Serie> serieListModel;
	private ComboBoxModel<Genre> genreListModel;
	private ComboBoxModel<Editeur> editeurListModel;
	
	private static LFAlbumsControler instance ;
	
	public LFAlbumsControler() {
		super();
		List<Album> albums = BedeAdministrator.getInstance().getListeAlbumForView();
		Collections.sort(albums);
		this.albumTableModel = new AlbumTableModel(albums);
		
	}

	public static LFAlbumsControler getInstance() {
		if (instance == null) {
			instance = new LFAlbumsControler();
		}
		return instance;	
	}	
	
	public void show() {
		view = new LFAlbums(this);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public AlbumTableModel getAlbumTableModel() {
		return albumTableModel;	
	}

	public ComboBoxModel<Serie> getSerieListModel() {
		return serieListModel;
	}

	public ComboBoxModel<Genre> getGenreListModel() {
		return genreListModel;
	}

	public ComboBoxModel<Editeur> getEditeurListModel() {
		return editeurListModel;
	}
	
	
	
	
}
