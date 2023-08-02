package com.epicode.RubricaUtenti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UtenteController {

		
	@GetMapping("/rubrica")
	public ModelAndView getHomePage(
			
			@PathVariable String nome,
			@PathVariable String cognome,
			@PathVariable Integer age,
			@PathVariable String email) {
		ModelAndView model = new ModelAndView("NewFile");
		model.addObject("name", nome);
		model.addObject("surname", cognome);
		model.addObject("age", age);
		model.addObject("email", email);
		return model;
	}
	
}
