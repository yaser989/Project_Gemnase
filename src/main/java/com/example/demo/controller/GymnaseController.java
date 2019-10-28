package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.GymnasesRepository;

@RequestMapping("gymnases")
@Controller
public class GymnaseController {

	@Autowired
	private GymnasesRepository gymnasesRepository;

	// Page d'accueil de l'application
	@GetMapping("/home/{id}")
	public String home(@PathVariable("id") Long idg) {
		return "home";
	}


	// Liste de tous les gymnases
	@GetMapping("/list")
	public String getGymnaseList(Model model) {
		model.addAttribute("gymnases", gymnasesRepository.findAll());
		return "gymnases";
	}

	// Détails d'un gymnase par idGymnase
	@GetMapping("/{idGymnase}")
	public String getByIdGymnase(@PathVariable("idGymnase") Long idGymnase, Model model) {
		model.addAttribute("gymnase", gymnasesRepository.findByIdGymnase(idGymnase));
		return "gymnaseDetails";
	}

	// Liste des gymnases par nom
	@GetMapping("/{nomGymnase}")
	public String getByName(@PathVariable("nomGymnase") String nomGymnase, Model model) {
		model.addAttribute("gymnase", gymnasesRepository.findByNomGymnase(nomGymnase));
		return "gymnaseDetails";
	}
	
	// Liste des gymnases par nom
	@GetMapping("/{adresse}")
	public String getByAdresse(@PathVariable("adresse") String adresse, Model model) {
		model.addAttribute("gymnases", gymnasesRepository.findByAdresse(adresse));
		return "gymnaseDetails";
	}
	
	// Liste des gymnases par nom
//	@GetMapping("/{}")
//	public String getListByName(@PathVariable("nomGymnase") Long nomGymnase, Model model) {
//		model.addAttribute("gymnases", gymnasesRepository.findByIdGymnase(nomGymnase));
//		return "gymnaseDetails";
//	}
	
	

}