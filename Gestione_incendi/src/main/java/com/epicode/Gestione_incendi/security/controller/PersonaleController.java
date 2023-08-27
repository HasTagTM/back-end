package com.epicode.Gestione_incendi.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Gestione_incendi.security.entity.Personale;

import com.epicode.Gestione_incendi.security.service.PersonaleService;

@RestController
@RequestMapping("/api/personale")
public class PersonaleController {
	
	@Autowired PersonaleService persSvc;

	@GetMapping("/personale")
	public ResponseEntity<List<Personale>> getPersonale() {
		List<Personale> listaPersonale = persSvc.getAllPersonale();
		ResponseEntity<List<Personale>> rispostaAlFront = new ResponseEntity<List<Personale>>(listaPersonale, HttpStatus.OK);
		return rispostaAlFront;

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getSondaById(@PathVariable Long id) {
		Personale u = persSvc.personaleId(id);
		return new ResponseEntity<Personale>(u, HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<?> creaSonda(@RequestBody Personale utente) {
		Personale u = persSvc.creaPersonale(utente);
		return new ResponseEntity<Personale>(u, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modificaPersonale(@PathVariable Long id, @RequestBody Personale utente) throws Exception{
		Personale u = persSvc.modificaUtentePerId(id, utente);
		return new ResponseEntity<Personale>(u, HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> cancellaPersonale(@PathVariable Long id) {
		String msg = persSvc.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}
	
}
