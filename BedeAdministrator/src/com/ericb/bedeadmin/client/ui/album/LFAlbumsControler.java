package com.ericb.bedeadmin.client.ui.album;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.server.BedeAdministrator;

public class LFAlbumsControler  implements ActionListener{
	
	private LFAlbums view;
	private AlbumTableModel model;
	private static LFAlbumsControler instance ;
	
	public LFAlbumsControler() {
		super();
		List<Album> albums = BedeAdministrator.getInstance().getListeAlbumForView();
		Collections.sort(albums);
		this.model = new AlbumTableModel(albums);
		
	}

	public static LFAlbumsControler getInstance() {
		if (instance == null) {
			instance = new LFAlbumsControler();
		}
		return instance;	
	}	
	
	public void show() {
		view = new LFAlbums(this, model);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
