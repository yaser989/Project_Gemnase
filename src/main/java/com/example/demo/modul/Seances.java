package com.example.demo.modul;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Seances")
public class Seances {
	
	@Id
	private Long IdSportifEntraineur;
	
	@Field(value = "Jour")
	private String Jour;
	
	@Field(value = "Horaire")
	private int Horaire;
	
	@Field(value = "Duree")
	private int Duree;
	
	@Field(value = "Libelle")
	private String Libelle;

	public Seances() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seances(Long idSportifEntraineur, String jour, int horaire, int duree, String libelle) {
		super();
		IdSportifEntraineur = idSportifEntraineur;
		Jour = jour;
		Horaire = horaire;
		Duree = duree;
		Libelle = libelle;
	}

	public Long getIdSportifEntraineur() {
		return IdSportifEntraineur;
	}

	public void setIdSportifEntraineur(Long idSportifEntraineur) {
		IdSportifEntraineur = idSportifEntraineur;
	}

	public String getJour() {
		return Jour;
	}

	public void setJour(String jour) {
		Jour = jour;
	}

	public int getHoraire() {
		return Horaire;
	}

	public void setHoraire(int horaire) {
		Horaire = horaire;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	@Override
	public String toString() {
		return "Seances [IdSportifEntraineur=" + IdSportifEntraineur + ", Jour=" + Jour + ", Horaire=" + Horaire
				+ ", Duree=" + Duree + ", Libelle=" + Libelle + "]";
	}

	
}
