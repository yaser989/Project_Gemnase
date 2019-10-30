package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modul.Sportifs;
import com.example.demo.modul.Sports;

public interface SportifsRepository extends MongoRepository<Sportifs, String>{
	
	public List <Sportifs> findByIdSportif(Long idSportif);
	
	public List <Sportifs> findByNom(String nom);

	public List <Sportifs> findByPrenom(String prenom);

	public List <Sportifs> findBySexe(String sexe);

	public List <Sportifs> findByAge(int age);
	
	public List <Sportifs> findBySports(Sports sports);


	
	public List <Sportifs> findByAgeGreaterThan(int age);
	public List <Sportifs> findByAgeLessThan(int age);
	public List <Sportifs> findByAgeBetween(int from, int to);

	
	
	
//	@Field(value = "IdSportif")
//    private Long idSportif;
//	
//	@Field(value = "Nom")
//	private String nom ;
//	
//	@Field(value = "Prenom")
//	private String prenom;
//	
//	@Field(value = "Sexe")
//	private String sexe;
//	
//	@Field(value = "Age")
//	private int age;
//	
//	@Field(value = "Sport")
//	private Sports sport;
//	
//	@Field(value = "IdSportifConseiller")
//	private Long idSportifConseiller;

}
