package com.example.demo.modul;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Sports")
public class Sports {
	
	@Field(value = "Jouer")
	private String  [] jouer;
	@Field(value = "Arbitrer")
	private String  [] arbitrer;
	@Field(value = "Entrainer")
	private String  [] entrainer;
	
	public Sports() {
		super();
	}

	public String[] getJouer() {
		return jouer;
	}

	public String[] getArbitrer() {
		return arbitrer;
	}

	public String[] getEntrainer() {
		return entrainer;
	}

	public void setJouer(String[] jouer) {
		this.jouer = jouer;
	}

	public void setArbitrer(String[] arbitrer) {
		this.arbitrer = arbitrer;
	}

	public void setEntrainer(String[] entrainer) {
		this.entrainer = entrainer;
	}

	public Sports(String[] jouer, String[] arbitrer, String[] entrainer) {
		super();
		this.jouer = jouer;
		this.arbitrer = arbitrer;
		this.entrainer = entrainer;
	}
	


}
