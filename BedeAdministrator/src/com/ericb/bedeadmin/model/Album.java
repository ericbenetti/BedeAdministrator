package com.ericb.bedeadmin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Album extends Entite {

	private String numero;
	private String cycle;
	private Date depotLegal;
	private String idSiteRef;
	private String isbn;
	private FormatAlbum format;
	private boolean possede;
	private boolean horsSerie;
	private boolean premiereEdition;
	private String couverture;
	private Serie serie;
	private Editeur editeur;
	private Genre genre;
	private List<Auteur> auteurs;
	
	public Album(Serie serie, boolean horsSerie, String numero, String cycle, String titre, String couverture) {
		this(0, titre, numero, cycle, null, null, false, horsSerie, false, couverture, serie, null, null, new ArrayList<Auteur>());
	}
	
	public Album(String titre) {
		this(0, titre, null, null, null, null, false, false, false, null, null, null, null, new ArrayList<Auteur>());
	}

	public Album(int id, String titre, String numero, String cycle, Date dateSortie, String idSiteRef, boolean possede, boolean horsSerie, boolean premiereEdition, String couverture, Serie serie, Editeur editeur, Genre genre, List<Auteur> auteurs) {
		super(id, titre);
		this.numero = numero;
		this.cycle = cycle;
		this.depotLegal = dateSortie;
		this.idSiteRef = idSiteRef;
		this.possede = possede;
		this.couverture = couverture;
		this.serie = serie;
		this.editeur = editeur;
		this.genre = genre;
		this.auteurs = auteurs;
	}


	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public String getTitre() {
		return getLibelle();
	}

	public void setTitre(String titre) {
		setLibelle(titre);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Date getDepotLegal() {
		return depotLegal;
	}

	public void setDepotLegal(Date dateSortie) {
		this.depotLegal = dateSortie;
	}

	public String getIdSiteRef() {
		return idSiteRef;
	}

	public void setIdSiteRef(String idSiteRef) {
		this.idSiteRef = idSiteRef;
	}

	public boolean isPossede() {
		return possede;
	}

	public void setPossede(boolean possede) {
		this.possede = possede;
	}

	public String getCouverture() {
		return couverture;
	}

	public void setCouverture(String couverture) {
		this.couverture = couverture;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public boolean isHorsSerie() {
		return horsSerie;
	}

	public void setHorsSerie(boolean horsSerie) {
		this.horsSerie = horsSerie;
	}

	public boolean isPremiereEdition() {
		return premiereEdition;
	}

	public void setPremiereEdition(boolean premiereEdition) {
		this.premiereEdition = premiereEdition;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public FormatAlbum getFormat() {
		return format;
	}

	public void setFormat(FormatAlbum format) {
		this.format = format;
	}
	

}
