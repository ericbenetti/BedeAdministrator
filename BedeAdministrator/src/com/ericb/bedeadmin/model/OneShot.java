package com.ericb.bedeadmin.model;

import java.util.ArrayList;
import java.util.List;

public class OneShot extends Serie {

	public OneShot(Album album) {
		super(0, album.getTitre(), true, 1, album.getGenre(), new ArrayList<Album>());
		getAlbums().add(album);
	}

	@Override
	public int getId() {
		return 0;
	}

	@Override
	public void setId(int id) {
		//Cette m�thode ne fait rien, en OneShot la s�rie n' pas d'id (elle n'existe pas r�ellement
	}

	@Override
	public void setAlbums(List<Album> albums) {
		//Cette m�thode ne fait rien, en OneShot la s�rie n'a qu'un seul album
	}

	public void setAlbum(Album album) {
		//en OneShot la s�rie n'a qu'un seul album
		getAlbums().remove(0);
		getAlbums().add(album);
	}


	@Override
	public void setTerrmine(boolean terrmine) {
		//Cette m�thode ne fait rien, en OneShot la s�rie est toujours termin�e
	}
	
	

}
