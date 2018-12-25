package com.forfun.jdr.naheulbeuk.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "player")
public class Player {
	
	@Id
    private String id;
	
    private String nom;
    private String perso;
    private int evMax;
    private int ev;
    private int eaMax;
    private int ea;
    private int or;
    private int argent;
    private int attaque;
    private int parade;
    private int niveau;
    private int experience;
    private int courage;
    private int intelligence;
    private int charisme;
    private int adresse;
    private int force;
    private String origine;
    private String metier;
    private String sexe;
    private int destin;
    private int protectionMax;
    private int protection;
    
    private int resistanceMagique; // (courage + intelligence + force) /3
    private int magiePhysique; // (intelligence + adresse ) /2
    private int magiePsychique; // (intelligence + charisme) /2
    private int esquive; // (epreuve adresse)
    
    private List<Competence> competences;
    private List<Objet> objets;
    
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

	public int getEvMax() {
		return evMax;
	}

	public void setEvMax(int evMax) {
		this.evMax = evMax;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

	public int getEaMax() {
		return eaMax;
	}

	public void setEaMax(int eaMax) {
		this.eaMax = eaMax;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public int getOr() {
		return or;
	}

	public void setOr(int or) {
		this.or = or;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getParade() {
		return parade;
	}

	public void setParade(int parade) {
		this.parade = parade;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getCharisme() {
		return charisme;
	}

	public void setCharisme(int charisme) {
		this.charisme = charisme;
	}

	public int getAdresse() {
		return adresse;
	}

	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
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

	public int getDestin() {
		return destin;
	}

	public void setDestin(int destin) {
		this.destin = destin;
	}

	public int getProtectionMax() {
		return protectionMax;
	}

	public void setProtectionMax(int protectionMax) {
		this.protectionMax = protectionMax;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	// (courage + intelligence + force) /3
	public int getResistanceMagique() {
		return Math.round((intelligence + courage +force)/3);
	}

	public void setResistanceMagique(int resistanceMagique) {
		this.resistanceMagique = resistanceMagique;
	}

	// magiePhysique(intelligence + adresse ) /2
	public int getMagiePhysique() {
		return Math.round((intelligence + adresse)/2);
	}

	public void setMagiePhysique(int magiePhysique) {
		this.magiePhysique = magiePhysique;
	}

	// magiePsychique (intelligence + charisme) /2
	public int getMagiePsychique() {
		return Math.round((intelligence + charisme)/2) ;
	}

	public void setMagiePsychique(int magiePsychique) {
		this.magiePsychique = magiePsychique;
	}

	// esquive (epreuve adresse)
	public int getEsquive() {
		return adresse;
	}

	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public List<Objet> getObjets() {
		return objets;
	}

	public void setObjets(List<Objet> objets) {
		this.objets = objets;
	}
	
}