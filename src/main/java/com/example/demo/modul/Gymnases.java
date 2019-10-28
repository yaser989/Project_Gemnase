package com.example.demo.modul;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Gymnases")
public class Gymnases {

	
    private Long IdGymnase;
	
	@Field(value = "NomGymnase")
	private String NomGymnase;
	
	@Field(value = "Adresse")
	private String Adresse;
	
	@Field(value = "Ville")
	private String Ville;
	
	@Field(value = "surFaceVille")
	private int Surface;
	
	@Field(value = "seances")
	private List<Seances> seances;

	public Gymnases() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gymnases(Long idGymnase, String nomGymnase, String adresse, String ville, int surface,
			List<Seances> seances) {
		super();
		IdGymnase = idGymnase;
		NomGymnase = nomGymnase;
		Adresse = adresse;
		Ville = ville;
		Surface = surface;
		this.seances = seances;
	}

	public Long getIdGymnase() {
		return IdGymnase;
	}

	public void setIdGymnase(Long idGymnase) {
		IdGymnase = idGymnase;
	}

	public String getNomGymnase() {
		return NomGymnase;
	}

	public void setNomGymnase(String nomGymnase) {
		NomGymnase = nomGymnase;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public int getSurface() {
		return Surface;
	}

	public void setSurface(int surface) {
		Surface = surface;
	}

	public List<Seances> getSeances() {
		return seances;
	}

	public void setSeances(List<Seances> seances) {
		this.seances = seances;
	}

	@Override
	public String toString() {
		return "Gymnases [IdGymnase=" + IdGymnase + ", NomGymnase=" + NomGymnase + ", Adresse=" + Adresse + ", Ville="
				+ Ville + ", Surface=" + Surface + ", seances=" + seances + "]";
	}
	
	
	
	
	
}
