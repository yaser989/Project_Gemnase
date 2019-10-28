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


	@GetMapping("/list")
	public String getSportifList(Model model) {
		model.addAttribute("sportifs", sportifsRepository.findAll());
		return "sportifs";
	}
	
	@GetMapping("/{id}")
	public String getSportif(@PathVariable() Long id, Model model) {
		model.addAttribute("sportif", sportifsRepository.findById(id));
		return "sportifDetails";
	}
}