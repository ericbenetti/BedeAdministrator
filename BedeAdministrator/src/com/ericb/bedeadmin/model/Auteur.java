package com.ericb.bedeadmin.model;


public class Auteur {
	
	private Personne personne;
	private Metier metier;
	
	public Auteur(Personne personne, Metier metier) {
		this.personne = personne;
		this.metier = metier;
	}

	public Personne getPersonne() {
		return personne;
	}

	public Metier getMetier() {
		return metier;
	}

	@Override
	public String toString() {
		return personne + " (" + metier + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auteur other = (Auteur) obj;
		if (metier == null) {
			if (other.metier != null)
				return false;
		} else if (!metier.equals(other.metier))
			return false;
		if (personne == null) {
			if (other.personne != null)
				return false;
		} else if (!personne.equals(other.personne))
			return false;
		return true;
	}




}
