package com.example.demo.modul;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Sports")
public class Sports {
	
	@Field(value = "Jouer")
	private String  [] Jouer;
	@Field(value = "Arbitrer")
	private String  [] Arbitrer;
	@Field(value = "Entrainer")
	private String  [] Entrainer;
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sports(String[] jouer, String[] arbitrer, String[] entrainer) {
		super();
		Jouer = jouer;
		Arbitrer = arbitrer;
		Entrainer = entrainer;
	}
	public String[] getJouer() {
		return Jouer;
	}
	public void setJouer(String[] jouer) {
		Jouer = jouer;
	}
	public String[] getArbitrer() {
		return Arbitrer;
	}
	public void setArbitrer(String[] arbitrer) {
		Arbitrer = arbitrer;
	}
	public String[] getEntrainer() {
		return Entrainer;
	}
	public void setEntrainer(String[] entrainer) {
		Entrainer = entrainer;
	}
	@Override
	public String toString() {
		return "Sports [Jouer=" + Arrays.toString(Jouer) + ", Arbitrer=" + Arrays.toString(Arbitrer) + ", Entrainer="
				+ Arrays.toString(Entrainer) + "]";
	}
	
	

}
