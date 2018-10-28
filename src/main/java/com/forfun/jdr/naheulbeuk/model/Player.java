package com.forfun.jdr.naheulbeuk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "player")
public class Player {
	
	@Id
    private String id;
	
    private String nom;
    private String perso;
    private String ev;
    private String ea;
    private String or;
    private String attaque;
    private String parade;
    private String niveau;
    private String experience;
    private String courage;
    private String intelligence;
    private String charisme;
    private String adresse;
    private String force;
    private String origine;
    private String metier;
    private String sexe;
    private String destin;
 
    public Player() {}
 
    public Player(String nom, String perso) {
        this.nom = nom;
        this.perso = perso;
    }

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

	public String getPerso() {
		return perso;
	}

	public void setPerso(String perso) {
		this.perso = perso;
	}

	public String getEv() {
		return ev;
	}

	public void setEv(String ev) {
		this.ev = ev;
	}

	public String getEa() {
		return ea;
	}

	public void setEa(String ea) {
		this.ea = ea;
	}

	public String getOr() {
		return or;
	}

	public void setOr(String or) {
		this.or = or;
	}

	public String getAttaque() {
		return attaque;
	}

	public void setAttaque(String attaque) {
		this.attaque = attaque;
	}

	public String getParade() {
		return parade;
	}

	public void setParade(String parade) {
		this.parade = parade;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCourage() {
		return courage;
	}

	public void setCourage(String courage) {
		this.courage = courage;
	}

	public String getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(String intelligence) {
		this.intelligence = intelligence;
	}

	public String getCharisme() {
		return charisme;
	}

	public void setCharisme(String charisme) {
		this.charisme = charisme;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDestin() {
		return destin;
	}

	public void setDestin(String destin) {
		this.destin = destin;
	}
 
}