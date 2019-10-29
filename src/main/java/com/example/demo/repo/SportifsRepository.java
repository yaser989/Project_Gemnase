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

	public List <Sportifs> findByAge(String age);
	
	public List <Sportifs> findBySports(Sports sports);



	
	
	
	
}
