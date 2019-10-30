package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modul.Sportifs;
import com.example.demo.repo.SportifsRepository;

@RequestMapping("/sportifs")
@Controller
public class SportifController {

	@Autowired
	private SportifsRepository sportifsRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	// Page des sportifs
	@GetMapping("/list")
	public String getSportifList(Model model) {
		model.addAttribute("sportifs", sportifsRepository.findAll());
		model.addAttribute("count", sportifsRepository.findAll().size());
		return "sportifs";
	}
	
	@GetMapping("/list/entraineurs")
	public ResponseEntity<List<Sportifs>> getEntraineurList(Model model) {
		
		List<Sportifs> sportifs = new ArrayList<Sportifs>();
		for(Sportifs sp : sportifsRepository.findAll()) {
			if(!sp.getSport().equals(null)) {
				sportifs.add(sp);
			}
		}

		return ResponseEntity.ok(sportifs);
	}
	
	

	@PostMapping("/filter")
	public ResponseEntity<List<Sportifs>> filteredList(
			                                @RequestParam(required = false, value = "idSportif") String idSportif,
			                                @RequestParam(required = false, value = "nom") String nom,
			                                @RequestParam(required = false, value = "prenom") String prenom,
			                                @RequestParam(required = false, value = "sexe") String sexe,
			                                @RequestParam(required = false, value = "age") int age,
			                                @RequestParam(required = false, value = "idSportifConseiller") Long idSportifConseiller
			                                ) {
		
//		 "_id" : "566eec60662b388eba464240",
//	        "IdSportif" : 63,
//	        "Nom" : "AMAND",
//	        "Prenom" : "Patrick",
//	        "Sexe" : "M",
//	        "Age" : 30,
//	        "IdSportifConseiller" : 1,
//	        "Sports"
//		
		
		Query query = new Query();
		if(idSportif!=null) {
		query.addCriteria(Criteria.where("IdSportif").is(idSportif));
		}
		
		if(nom!=null) {
			query.addCriteria(Criteria.where("Nom").is(nom));
			}
		
		if(prenom!=null) {
			query.addCriteria(Criteria.where("Prenom").is(prenom));
			}
		
		if(sexe!=null) {
			query.addCriteria(Criteria.where("Sexe").is(sexe));
			}
		
		if(!Integer.valueOf(age).equals(null)) {
			query.addCriteria(Criteria.where("Age").is(age));
			}
//              is(idGymnase).and
//				("NomGymnase").is(nomGymnase).and
//				("Adresse").is(adresse).and
//				("Ville").is(ville).and
//				("Surface").is(surface));
		List<Sportifs> sportifs = mongoTemplate.find(query, Sportifs.class);
		return ResponseEntity.ok(sportifs);
	}

//	@GetMapping("/{idSportif}")
//	public String getByIdSportif(@PathVariable() Long idSportif, Model model) {
//		model.addAttribute("sportif", sportifsRepository.findByIdSportif(idSportif));
//		return "sportifDetails";
//	}
//
//	@GetMapping("/{nom}")
//	public String getByNom(@PathVariable() String nom, Model model) {
//		model.addAttribute("sportif", sportifsRepository.findByNom(nom));
//		model.addAttribute("count", sportifsRepository.findByNom(nom).size());
//		return "sportifDetails";
//	}
//
//	@GetMapping("/{prenom}")
//	public String getByPrenom(@PathVariable() String prenom, Model model) {
//		model.addAttribute("sportif", sportifsRepository.findByPrenom(prenom));
//		model.addAttribute("count", sportifsRepository.findByPrenom(prenom).size());
//
//		return "sportifDetails";
//	}
//
//	@GetMapping("/{sexe}")
//	public String getBySexe(@PathVariable() String sexe, Model model) {
//		model.addAttribute("sportif", sportifsRepository.findBySexe(sexe));
//		model.addAttribute("count", sportifsRepository.findBySexe(sexe).size());
//
//		return "sportifDetails";
//	}
//
//	@GetMapping("/{age}")
//	public String getByAge(@PathVariable() int age, Model model) {
//		model.addAttribute("sportif", sportifsRepository.findByAge(age));
//		model.addAttribute("count", sportifsRepository.findByAge(age).size());
//
//		return "sportifDetails";
//	}
}