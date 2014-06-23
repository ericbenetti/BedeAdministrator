package com.ericb.bedeadmin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Serie extends Entite {

	private boolean terrmine;
	private int nombreAlbums;
	private Genre genre;
	private List<Album> albums;

	public Serie(int id, String titre, boolean terrmine, int nombreAlbums, Genre genre, List<Album> albums) {
		super(id, titre);
		this.terrmine = terrmine;
		this.nombreAlbums = nombreAlbums;
		this.genre = genre;
		this.albums = albums;
	}

	public Serie(int id, String titre, boolean terrmine, int nombreAlbums) {
		this(id, titre, terrmine, nombreAlbums, null, new ArrayList<Album>());
	}
	
	public Serie(int id, String titre) {
		this(id, titre, false , 0, null, new ArrayList<Album>());
	}

	public Serie(String titre) {
		this(0, titre, false , 0, null, new ArrayList<Album>());
	}

	public Serie(int id) {
		this(id, null, false , 0, null, new ArrayList<Album>());
	}

	public String getTitre() {
		return getLibelle();
	}

	public void setTitre(String titre) {
		setLibelle(titre);
	}

	public boolean isTerrmine() {
		return terrmine;
	}

	@Override
	public String toString() {
		return getLibelle();
	}

	public void setTerrmine(boolean terrmine) {
		this.terrmine = terrmine;
	}


	public int getNombreAlbums() {
		return nombreAlbums;
	}


	public void setNombreAlbums(int nombreAlbums) {
		this.nombreAlbums = nombreAlbums;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Date getPremiereParution() {
		if ((albums!=null) && (albums.size()>0)) {
			return albums.get(0).getDepotLegal();
		} else {
			return null;
		}
	}
	
	public Date getDerniereParution(){
		if ((albums!=null) && (albums.size()>0)) {
			return albums.get(albums.size()-1).getDepotLegal();
		} else {
			return null;
		}		
	}
	
	
	public int getNombreAlbumsPossedes(){
		int count = 0;
		if ((albums!=null) && (albums.size()>0)) {
			for (Album album : albums) {
				count += (album.isPossede() && !album.isHorsSerie())? 1 : 0;
			}
		}
		return count;
	}
	
	public boolean estSerieComplete() {
		return (getNombreAlbums() == getNombreAlbumsPossedes());		
	}
	
}
