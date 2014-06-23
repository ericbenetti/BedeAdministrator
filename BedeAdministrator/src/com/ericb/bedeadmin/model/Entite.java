package com.ericb.bedeadmin.model;

import com.ericb.bedeadmin.server.dao.DBAction;

public abstract class Entite {
	
	private int id;
	private String libelle;
	private String statut;	
	private DBAction dbAction;
	public Entite(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dbAction = DBAction.NONE;
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

	public DBAction getDbAction() {
		return dbAction;
	}

	public void setDbAction(DBAction dbAction) {
		this.dbAction = dbAction;
	}
	
	
}
