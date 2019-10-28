package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD:src/main/java/com/example/demo/controller/GymnaseController.java
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> 7c8acf23fab939763202189f00ee0056173ce202:src/main/java/com/example/demo/controller/VuController.java

import com.example.demo.modul.Gymnases;
import com.example.demo.repo.GymnasesRepository;

@Controller
public class GymnaseController {
	

	@Autowired
	private GymnasesRepository gymnasesRepository;
	
	static List<Gymnases> gm= new ArrayList<>();
	
<<<<<<< HEAD:src/main/java/com/example/demo/controller/GymnaseController.java
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/gymnases")
	public String getGymnaseList(Model model) {
		model.addAttribute("gymnases", gymnasesRepository.findAll());
		return "gymnases";
=======
	
	@GetMapping("/home")
	public String gemnasses() {
		gm=gymnasesRepository.findAll();
		System.out.println(gm);
		return "home";
>>>>>>> 7c8acf23fab939763202189f00ee0056173ce202:src/main/java/com/example/demo/controller/VuController.java
	}
	 
}
