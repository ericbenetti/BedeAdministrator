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
		//Cette méthode ne fait rien, en OneShot la série n' pas d'id (elle n'existe pas réellement
	}

	@Override
	public void setAlbums(List<Album> albums) {
		//Cette méthode ne fait rien, en OneShot la série n'a qu'un seul album
	}

	public void setAlbum(Album album) {
		//en OneShot la série n'a qu'un seul album
		getAlbums().remove(0);
		getAlbums().add(album);
	}


	@Override
	public void setTerrmine(boolean terrmine) {
		//Cette méthode ne fait rien, en OneShot la série est toujours terminée
	}
	
	

}
