package com.ericb.bedeadmin.model;

public abstract class Entite {
	
	private int id;
	private String libelle;
	private String statut;	
	
	public Entite(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
}
