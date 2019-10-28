package com.example.demo.modul;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Gymnases")
public class Gymnases {

	@Field(value = "IdGymnase")
	private Long idGymnase;

	@Field(value = "NomGymnase")
	private String nomGymnase;

	@Field(value = "Adresse")
	private String adresse;

	@Field(value = "Ville")
	private String ville;

	@Field(value = "Surface")
	private Double surface;

	@Field(value = "Seances")
	private List<Seances> seances;

	public Gymnases(Long idGymnase, String nomGymnase, String adresse, String ville, Double surface,
			List<Seances> seances) {
		super();
		this.idGymnase = idGymnase;
		this.nomGymnase = nomGymnase;
		this.adresse = adresse;
		this.ville = ville;
		this.surface = surface;
		this.seances = seances;
	}

	public Gymnases() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdGymnase() {
		return idGymnase;
	}

	public String getNomGymnase() {
		return nomGymnase;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getVille() {
		return ville;
	}

	public Double getSurface() {
		return surface;
	}

	public List<Seances> getSeances() {
		return seances;
	}

	public void setIdGymnase(Long idGymnase) {
		this.idGymnase = idGymnase;
	}

	public void setNomGymnase(String nomGymnase) {
		this.nomGymnase = nomGymnase;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public void setSeances(List<Seances> seances) {
		this.seances = seances;
	}

	@Override
	public String toString() {
		return "Gymnases [idGymnase=" + idGymnase + ", nomGymnase=" + nomGymnase + ", adresse=" + adresse + ", ville="
				+ ville + ", surface=" + surface + ", seances=" + seances + "]";
	}

}
