package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modul.Gymnases;
import com.example.demo.repo.GymnasesRepository;

@Controller
public class VuController {
	

	@Autowired
	private GymnasesRepository gymnasesRepository;
	
	static List<Gymnases> gm= new ArrayList<>();
	
	 @ResponseBody
	@RequestMapping("/index")
	public String gemnasses() {
		gm=gymnasesRepository.findAll();
		System.out.println(gm);
		return "index";
	}
}
