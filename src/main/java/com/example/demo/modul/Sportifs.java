package com.example.demo.modul;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Sportifs")
public class Sportifs {
	
	@Field(value = "IdSportif")
    private Long idSportif;
	
	@Field(value = "Nom")
	private String nom ;
	
	@Field(value = "Prenom")
	private String prenom;
	
	@Field(value = "Sexe")
	private String sexe;
	
	@Field(value = "Age")
	private int age;
	
	@Field(value = "Sport")
	private Sports sport;
	
	@Field(value = "IdSportifConseiller")
	private Long idSportifConseiller;

	public Sportifs() {
		super();
	}

	public Sportifs(Long idSportif, String nom, String prenom, String sexe, int age, Sports sport,
			Long idSportifConseiller) {
		super();
		this.idSportif = idSportif;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.sport = sport;
		this.idSportifConseiller = idSportifConseiller;
	}

	public Long getIdSportif() {
		return idSportif;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public int getAge() {
		return age;
	}

	public Sports getSport() {
		return sport;
	}

	public Long getIdSportifConseiller() {
		return idSportifConseiller;
	}

	public void setIdSportif(Long idSportif) {
		this.idSportif = idSportif;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSport(Sports sport) {
		this.sport = sport;
	}

	public void setIdSportifConseiller(Long idSportifConseiller) {
		this.idSportifConseiller = idSportifConseiller;
	}

	@Override
	public String toString() {
		return "Sportifs [idSportif=" + idSportif + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", age="
				+ age + ", sport=" + sport + ", idSportifConseiller=" + idSportifConseiller + "]";
	}

	

}
