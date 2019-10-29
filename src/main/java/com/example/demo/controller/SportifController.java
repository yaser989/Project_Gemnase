package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.SportifsRepository;

@RequestMapping("/sportifs")
@Controller
public class SportifController {

	@Autowired
	private SportifsRepository sportifsRepository;

	// Page des sportifs
	@GetMapping("/list")
	public String getSportifList(Model model) {
		model.addAttribute("sportifs", sportifsRepository.findAll());
		model.addAttribute("count", sportifsRepository.findAll().size());
		return "sportifs";
	}

	@GetMapping("/{idSportif}")
	public String getByIdSportif(@PathVariable() Long idSportif, Model model) {
		model.addAttribute("sportif", sportifsRepository.findByIdSportif(idSportif));
		return "sportifDetails";
	}

	@GetMapping("/{nom}")
	public String getByNom(@PathVariable() String nom, Model model) {
		model.addAttribute("sportif", sportifsRepository.findByNom(nom));
		return "sportifDetails";
	}

	@GetMapping("/{prenom}")
	public String getByPrenom(@PathVariable() String prenom, Model model) {
		model.addAttribute("sportif", sportifsRepository.findByPrenom(prenom));
		return "sportifDetails";
	}

	@GetMapping("/{sexe}")
	public String getBySexe(@PathVariable() String sexe, Model model) {
		model.addAttribute("sportif", sportifsRepository.findBySexe(sexe));
		return "sportifDetails";
	}

	@GetMapping("/{age}")
	public String getByAge(@PathVariable() String age, Model model) {
		model.addAttribute("sportif", sportifsRepository.findByAge(age));
		return "sportifDetails";
	}
}