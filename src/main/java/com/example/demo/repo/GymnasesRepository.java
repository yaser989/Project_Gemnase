package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modul.Gymnases;

public interface GymnasesRepository extends MongoRepository<Gymnases, String> {

	public List<Gymnases> findByIdGymnase(Long IdGymnase);

	public List<Gymnases> findByNomGymnase(String NomGymnase);

	public List<Gymnases> findByAdresse(String Adresse);

	public List<Gymnases> findByVille(String Ville);

	public List<Gymnases> findBySurface(Double Surface);

//	@Id
//	@Field(value = "IdGymnase")
//    private Long IdGymnase;
//	
//	@Field(value = "NomGymnase")
//	private String NomGymnase;
//	
//	@Field(value = "Adresse")
//	private String Adresse;
//	
//	@Field(value = "Ville")
//	private String Ville;
//	
//	@Field(value = "Surface")
//	private Double Surface;
//	
//	@Field(value = "Seances")
//	private List<Seances> seances;

}
