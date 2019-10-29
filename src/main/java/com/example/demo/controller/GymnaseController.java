package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modul.Gymnases;
import com.example.demo.repo.GymnasesRepository;

@Controller
public class GymnaseController {
	

	@Autowired
	private GymnasesRepository gymnasesRepository;
	
	

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/gymnases")
	public String getGymnaseList(Model model) {
		model.addAttribute("gymnases", gymnasesRepository.findAll());
		return "gymnases";
	}
<<<<<<< Updated upstream
=======

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
		model.addAttribute("count", gymnasesRepository.findByNomGymnase(nomGymnase).size());

		return "gymnaseDetails";
	}
>>>>>>> Stashed changes
	

	 
}
