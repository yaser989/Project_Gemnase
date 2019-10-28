package com.example.demo.modul;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Sportifs")
public class Sportifs {
	
	@Id
    private Long IdSportif;
	
	@Field(value = "Nom")
	private String Nom ;
	
	@Field(value = "Prenom")
	private String Prenom;
	
	@Field(value = "Sexe")
	private String Sexe;
	
	@Field(value = "Age")
	private int Age;
	
	@Field(value = "sport")
	private Sports sport;
	
	@Field(value = "IdSportifConseiller")
	private Long IdSportifConseiller;

	public Sportifs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sportifs(Long idSportif, String nom, String prenom, String sexe, int age, Sports sport,
			Long idSportifConseiller) {
		super();
		IdSportif = idSportif;
		Nom = nom;
		Prenom = prenom;
		Sexe = sexe;
		Age = age;
		this.sport = sport;
		IdSportifConseiller = idSportifConseiller;
	}

	public Long getIdSportif() {
		return IdSportif;
	}

	public void setIdSportif(Long idSportif) {
		IdSportif = idSportif;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Sports getSport() {
		return sport;
	}

	public void setSport(Sports sport) {
		this.sport = sport;
	}

	public Long getIdSportifConseiller() {
		return IdSportifConseiller;
	}

	public void setIdSportifConseiller(Long idSportifConseiller) {
		IdSportifConseiller = idSportifConseiller;
	}

	@Override
	public String toString() {
		return "Sportifs [IdSportif=" + IdSportif + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Sexe=" + Sexe + ", Age="
				+ Age + ", sport=" + sport + ", IdSportifConseiller=" + IdSportifConseiller + "]";
	}
	
	

}
