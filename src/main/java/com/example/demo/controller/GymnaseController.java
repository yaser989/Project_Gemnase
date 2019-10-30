package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modul.Gymnases;
import com.example.demo.modul.Sportifs;
import com.example.demo.repo.GymnasesRepository;

@RequestMapping("gymnases")
@Controller
public class GymnaseController {

	@Autowired
	private GymnasesRepository gymnasesRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;

	// Page d'accueil de l'application
	@GetMapping("/home")
	public String home() {
		return "home";
	}


	// Liste de tous les gymnases
	@GetMapping("/list")
	public String getGymnaseList(Model model) {
		model.addAttribute("gymnases", gymnasesRepository.findAll());
		model.addAttribute("count", gymnasesRepository.findAll().size());
		return "gymnases";
	}
	
//	@PostMapping("/filter")
//	public ResponseEntity<List<Gymnases>> filteredList(
//			                                @RequestParam(required = false, value = "idGymnase") String idGymnase,
//			                                @RequestParam(required = false, value = "nomGymnase") String nomGymnase,
//			                                @RequestParam(required = false, value = "adresse") String adresse,
//			                                @RequestParam(required = false, value = "ville") String ville,
//			                                @RequestParam(required = false, value = "surface") Double surface) {
//		Query query = new Query();
//		if(idGymnase!=null) {
//		query.addCriteria(Criteria.where("IdGymnase").is(idGymnase));
//		}
//		
//		if(nomGymnase!=null) {
//			query.addCriteria(Criteria.where("NomGymnase").is(nomGymnase));
//			}
//		
//		if(adresse!=null) {
//			query.addCriteria(Criteria.where("Adresse").is(adresse));
//			}
//		
//		if(ville!=null) {
//			query.addCriteria(Criteria.where("Ville").is(ville));
//			}
//		
//		if(surface!=null) {
//			query.addCriteria(Criteria.where("Surface").is(surface));
//			}
////              is(idGymnase).and
////				("NomGymnase").is(nomGymnase).and
////				("Adresse").is(adresse).and
////				("Ville").is(ville).and
////				("Surface").is(surface));
//		List<Gymnases> gymnases = mongoTemplate.find(query, Gymnases.class);
//		return ResponseEntity.ok(gymnases);
//	}
	
	@PostMapping("/filter")
	public String filteredList(Model model,
			                                @RequestParam(required = false, value = "idGymnase") String idGymnase,
			                                @RequestParam(required = false, value = "nomGymnase") String nomGymnase,
			                                @RequestParam(required = false, value = "adresse") String adresse,
			                                @RequestParam(required = false, value = "ville") String ville,
			                                @RequestParam(required = false, value = "surface") Double surface) {
		Query query = new Query();
		if(idGymnase!=null) {
		query.addCriteria(Criteria.where("IdGymnase").is(idGymnase));
		}
		
		if(nomGymnase!=null) {
			query.addCriteria(Criteria.where("NomGymnase").is(nomGymnase));
			}
		
		if(adresse!=null) {
			query.addCriteria(Criteria.where("Adresse").is(adresse));
			}
		
		if(ville!=null) {
			query.addCriteria(Criteria.where("Ville").is(ville));
			}
		
		if(surface!=null) {
			query.addCriteria(Criteria.where("Surface").is(surface));
			}

		model.addAttribute("gymnases", mongoTemplate.find(query, Gymnases.class));
		return "gymnases";
	}

	// Détails d'un gymnase par idGymnase
	@GetMapping("/{idGymnase}")
	public ResponseEntity<List<Gymnases>> getByIdGym(@PathVariable("idGymnase") Long idGymnase, Model model) {

		Query query = new Query();

		if(idGymnase!=null) {
			query.addCriteria(Criteria.where("IdGymnase").is(idGymnase));
			}
		
		return ResponseEntity.ok(mongoTemplate.find(query, Gymnases.class));
	}
	
//	// Détails d'un gymnase par idGymnase
//	@GetMapping("/{idGymnase}")
//	public String getByIdGymnase(@PathVariable("idGymnase") Long idGymnase, Model model) {
//		model.addAttribute("gymnase", gymnasesRepository.findByIdGymnase(idGymnase));
//		return "gymnaseDetails";
//	}

	// Liste des gymnases par nom
//	@GetMapping("/{nomGymnase}")
//	public String getByName(@PathVariable("nomGymnase") String nomGymnase, Model model) {
//		model.addAttribute("gymnase", gymnasesRepository.findByNomGymnase(nomGymnase));
//		return "gymnaseDetails";
//	}
//	
//	// Liste des gymnases par adresse
//	@GetMapping("/{adresse}")
//	public String getByAdresse(@PathVariable("adresse") String adresse, Model model) {
//		model.addAttribute("gymnases", gymnasesRepository.findByAdresse(adresse));
//		return "gymnaseDetails";
//	}
		

}