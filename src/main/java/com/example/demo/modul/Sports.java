package com.example.demo.modul;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "Sports")
public class Sports {
	
	@Field(value = "Jouer")
	private List<Sports> jouer;
	@Field(value = "Arbitrer")
	private List<Sports> arbitrer;
	@Field(value = "Entrainer")
	private List<Sports> entrainer;
	
}
