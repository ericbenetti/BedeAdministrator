package com.ericb.bedeadmin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Album extends Entite implements Comparable<Album>{

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

	private String scenario;
	private String dessin;
	private String couleur;


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
		this.horsSerie = horsSerie;
		this.premiereEdition = premiereEdition;
		this.couverture = couverture;
		this.serie = serie;
		this.editeur = editeur;
		this.genre = genre;
		setAuteurs(auteurs); 
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
		this.scenario = "";
		this.dessin = "";
		this.couleur = "";	
		if (auteurs!=null) {
			for (Auteur auteur : auteurs) {
				if (auteur.getMetier()!=null) { 
					if (auteur.getMetier().getLibelle().equals("Scenario")) {  
						scenario += (scenario.equals("") ? "" : "; ") + auteur.getPersonne().getNomUsuel();
					} else if (auteur.getMetier().getLibelle().equals("Dessin")) {  
						dessin += (dessin.equals("") ? "" : "; ") + auteur.getPersonne().getNomUsuel();
					} else if (auteur.getMetier().getLibelle().equals("Couleur")) {  
						couleur += (couleur.equals("") ? "" : "; ") + auteur.getPersonne().getNomUsuel();
					}
				}
			} 
		}
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

	public String getScenario() {
		return this.scenario;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public String getDessin() {
		return this.dessin;
	}

	public String getTitreCompletHtml() {
		String html = "<html>";
		if (this.serie != null) {
			html += "<b>" + this.serie.getTitre() + "</b>";
			if (this.isHorsSerie()) {
				html += " - HS";
			} else if (this.numero != null) {
				html += " - " + this.numero;
			}

			if (this.cycle != null) {
				html += " - " + this.cycle;
			}
			html += " - " ;
		}
		html += this.getTitre() + "</html>";	
		return html;
	}

	public boolean add(Auteur e) {
		return auteurs.add(e);
	}

	public void clear() {
		auteurs.clear();
	}

	@Override
	public boolean equals(Object obj) {
		return this.getTitreCompletHtml().equals(((Album)obj).getTitreCompletHtml());
	}

	@Override
	public int compareTo(Album other) {
		String thisTitre = "";
		String otherTitre= "";
		
		
		if ((this.getSerie()!= null)) {
			thisTitre = this.getSerie().getTitre();
		}
		
		if ((other.getSerie()!= null)) {
			otherTitre = other.getSerie().getTitre();
		}
		
		if (thisTitre.equals(otherTitre)) {
			if (thisTitre.equals("")) {
				return this.getTitre().compareTo(other.getTitre());
			} else {
				if ((this.getCycle() != null) && (other.getCycle() != null) && this.getCycle().equals(other.getCycle())) {
					if ((this.getNumero() != null) && (other.getNumero() != null)){
						Integer thisNo  = new Integer(this.getNumero());
						Integer otherNo  = new Integer(other.getNumero());
						return thisNo.compareTo(otherNo);
						
					} else {
						if (this.getNumero() == null) {
							return -1;
						} else {
							return 1;
						}
					}
				} else {
					if ((this.getCycle() != null) && (other.getCycle() != null)) {
							return this.getCycle().compareTo(other.getCycle());
					} else if ((this.getCycle() == null) && (other.getCycle() == null)){
						if ((this.getNumero() != null) && (other.getNumero() != null)){
							Integer thisNo  = new Integer(this.getNumero());
							Integer otherNo  = new Integer(other.getNumero());
							return thisNo.compareTo(otherNo);
							
						} else {
							if (this.getNumero() == null) {
								return -1;
							} else {
								return 1;
							}
						}
						
					} else {
							if (this.getCycle() == null) {
							return -1;
						} else {
							return 1;
						}
						
					}
				}
			}
			
		} else {
			return thisTitre.compareTo(otherTitre);		
		}		
	}

}
