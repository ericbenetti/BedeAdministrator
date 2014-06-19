package com.ericb.bedeadmin.server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.model.Auteur;
import com.ericb.bedeadmin.model.Editeur;
import com.ericb.bedeadmin.model.FormatAlbum;
import com.ericb.bedeadmin.model.Genre;
import com.ericb.bedeadmin.model.Metier;
import com.ericb.bedeadmin.model.Personne;
import com.ericb.bedeadmin.model.Serie;
import com.ericb.bedeadmin.server.dao.DBConnection;


public class BedeAdministrator {

	static private BedeAdministrator singleton;
	
	public BedeAdministrator() {
		// TODO Auto-generated constructor stub
	}
	
	public static BedeAdministrator getInstance() {
		if (singleton==null) {
			singleton =new BedeAdministrator();
		}
		return singleton;
	}
	
	public List<Serie> getListeSerie() {
		List<Serie> series = new ArrayList<Serie>();		
		try {
			ResultSet rsSeries = DBConnection.getInstance().executeQuery("SELECT * FROM vue_serie ORDER BY titreSerie");
			while (rsSeries.next()) {
				
				Serie serie = new Serie(
						rsSeries.getInt("idSerie"),
						rsSeries.getString("titreSerie"),
						rsSeries.getBoolean("termine"),
						rsSeries.getInt("nombreAlbums"),
						new Genre(rsSeries.getInt("idGenre"), rsSeries.getString("libellegenre")),
						null);
				serie.setAlbums(getListeAlbum(serie));
				series.add(serie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return series;		
	}
	
	
	public List<Album> getListeAlbum(Serie serie) {
		List<Album> albums = new ArrayList<Album>();		
		try {
			ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM AlbumsSerie WHERE idSerie = " + serie.getId() + " ORDER BY depotLegal");
			while (rs.next()) {
				Album album = new Album(
						rs.getInt("idAlbum"), 
						rs.getString("TitreAlbum"), 
						rs.getString("Numero"), 
						rs.getString("cycle"), 
						rs.getDate("depotLegal"), 
						rs.getString("idSiteRef"), 
						rs.getBoolean("possede"), 
						rs.getBoolean("horsSerie"),
						rs.getBoolean("premiereEdition"), 
						rs.getString("couverture"), 
						serie, 
						new Editeur(rs.getInt("idEditeur"), rs.getString("NomEditeur") ), 
						new Genre(rs.getInt("idGenre"), rs.getString("LibelleGenre") ), 
						null);
				album.setFormat( (rs.getInt("formatAlbum") == 2) ? FormatAlbum.GRAND_FORMAT : FormatAlbum.FORMAT_NORMAL);
				album.setIsbn(rs.getString("isbn"));
				album.setAuteurs(getListeAuteur(album));
				albums.add(album);
			}
			return albums;
		} catch (SQLException e) {
			e.printStackTrace();
			return albums;
		}
		
	}

	public List<Auteur> getListeAuteur(Album album) {
		List<Auteur> auteurs = new ArrayList<Auteur>();		
		try {
			ResultSet rs = DBConnection.getInstance().executeQuery("SELECT * FROM AuteursAlbum WHERE idAlbum = " + album.getId());
			while (rs.next()) {
				Auteur auteur = new Auteur(new Personne(rs.getString("nom"), rs.getString("prenom"), rs.getString("nomUsuel")),
						new Metier(rs.getInt("idMetier"), rs.getString("libelleMetier")));
				auteurs.add(auteur);
			}
			return auteurs;
		} catch (SQLException e) {
			e.printStackTrace();
			return auteurs;
		}			
	}
	
	public int getTauxSerieComplete(List<Serie> series) {
		int total=0;
		int possedes=0;
		for (Serie serie : series) {
			total += serie.getNombreAlbums();
			possedes += serie.getNombreAlbumsPossedes();
		}
		return (possedes/total * 100);
	}

	public void closeDatabaseConnection() {
		// TODO Auto-generated method stub
		 DBConnection.getInstance().closeConnection();
	}
	


}
