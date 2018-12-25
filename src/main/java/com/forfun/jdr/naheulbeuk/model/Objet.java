package com.forfun.jdr.naheulbeuk.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "objet")
public class Objet implements Comparable<Objet> {

	@Id
    private String id;
	
	private String nom;
	private String description;
	private String bonus;
	private String malus;
	private String joueur;
	private int poids;
	
	public Objet() {}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getMalus() {
		return malus;
	}

	public void setMalus(String malus) {
		this.malus = malus;
	}

	public String getJoueur() {
		return joueur;
	}

	public void setJoueur(String joueur) {
		this.joueur = joueur;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public int compareTo(Objet arg0) {
		return this.nom.compareTo(arg0.getNom());
	}
	
}
