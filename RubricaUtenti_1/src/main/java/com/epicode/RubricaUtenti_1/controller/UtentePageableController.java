package com.epicode.RubricaUtenti_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.RubricaUtenti_1.model.Utente;
import com.epicode.RubricaUtenti_1.service.UtenteService;

@RestController
@RequestMapping("/utente/page")
public class UtentePageableController {

	@Autowired UtenteService UtenteSvc;
	
	@GetMapping
	public ResponseEntity<Page<Utente>> getAll(Pageable page){
		Page<Utente> paginaAllUtenti = UtenteSvc.getAllUtentiPage(page);
		ResponseEntity<Page<Utente>> risposta = new ResponseEntity<Page<Utente>>(paginaAllUtenti, HttpStatus.OK);
		return risposta;
	}
	
}
