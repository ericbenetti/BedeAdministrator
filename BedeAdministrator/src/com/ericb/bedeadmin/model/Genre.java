package com.ericb.bedeadmin.model;

public class Genre extends Entite {

	public Genre(String libelle) {
		super(0, libelle);
	}

	public Genre(int id, String libelle) {
		super(id, libelle);
	}

	@Override
	public String toString() {
		return getLibelle();
	}
	
}
