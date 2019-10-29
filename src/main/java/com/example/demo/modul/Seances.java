package com.example.demo.modul;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Seances")
public class Seances {
	
	@Field(value = "IdSportifEntraineur")
	private Long idSportifEntraineur;
	
	@Field(value = "Jour")
	private String jour;
	
	@Field(value = "Horaire")
	private int horaire;
	
	@Field(value = "Duree")
	private int duree;
	
	@Field(value = "Libelle")
	private String libelle;

	public Seances(Long idSportifEntraineur, String jour, int horaire, int duree, String libelle) {
		super();
		this.idSportifEntraineur = idSportifEntraineur;
		this.jour = jour;
		this.horaire = horaire;
		this.duree = duree;
		this.libelle = libelle;
	}

	public Seances() {
		super();
	}

	public Long getIdSportifEntraineur() {
		return idSportifEntraineur;
	}

	public String getJour() {
		return jour;
	}

	public int getHoraire() {
		return horaire;
	}

	public int getDuree() {
		return duree;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setIdSportifEntraineur(Long idSportifEntraineur) {
		this.idSportifEntraineur = idSportifEntraineur;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public void setHoraire(int horaire) {
		this.horaire = horaire;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}
