package com.ericb.bedeadmin.model;

import java.util.Date;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String nomUsuel;
	private Date dateNaissance;
	private Date dateDeces;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, String nomUsuel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nomUsuel = nomUsuel;
	}

	public Personne(int id, String nom, String prenom, String nomUsuel) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nomUsuel = nomUsuel;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomUsuel() {
		return nomUsuel;
	}

	public void setNomUsuel(String nomUsuel) {
		this.nomUsuel = nomUsuel;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateDeces() {
		return dateDeces;
	}

	public void setDateDeces(Date dateDeces) {
		this.dateDeces = dateDeces;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nomUsuel;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (nomUsuel == null) {
			if (other.nomUsuel != null)
				return false;
		} else if (!nomUsuel.equals(other.nomUsuel))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	
	
	
	
}
