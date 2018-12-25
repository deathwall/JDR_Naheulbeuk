package com.forfun.jdr.naheulbeuk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Competences")
public class Competence implements Comparable<Competence>{

	@Id
    private String id;
	
	private String nom;
	private String malus;
	private String bonus;
	private String joueur;
	
	public Competence() {}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMalus() {
		return malus;
	}

	public void setMalus(String malus) {
		this.malus = malus;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getJoueur() {
		return joueur;
	}

	public void setJoueur(String joueur) {
		this.joueur = joueur;
	}

	@Override
	public int compareTo(Competence o) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(o.getNom());
	}
	
}
