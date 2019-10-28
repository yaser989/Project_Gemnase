package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repo.SportifsRepository;

@Controller
public class SportifController {

	@Autowired
	private SportifsRepository sportifsRepository;


	@GetMapping("/sportifs")
	public String getSportifList(Model model) {
		model.addAttribute("sportifs", sportifsRepository.findAll());
		return "sportifs";

	}
}