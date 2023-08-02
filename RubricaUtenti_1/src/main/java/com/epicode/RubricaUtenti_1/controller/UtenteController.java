package com.epicode.RubricaUtenti_1.controller;

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

import com.epicode.RubricaUtenti_1.model.Utente;
import com.epicode.RubricaUtenti_1.service.UtenteService;
//http://localhost:8080

@RestController
@RequestMapping("/utente")
public class UtenteController {

	@Autowired UtenteService utenteSvc;
	
	@GetMapping("/home")
	public ResponseEntity<List<Utente>> getUtenti() {
		List<Utente> listaUtenti = utenteSvc.getAllUtenti();
		ResponseEntity<List<Utente>> rispostaAlFront = new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		return rispostaAlFront;

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUtentiById(@PathVariable Long id) {
		Utente u = utenteSvc.utenteId(id);
		return new ResponseEntity<Utente>(u, HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<?> creaUtente(@RequestBody Utente utente) {
		Utente u = utenteSvc.creaFrontUtente(utente);
		return new ResponseEntity<Utente>(u, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modificaUtente(@PathVariable Long id, @RequestBody Utente utente) throws Exception{
		Utente u = utenteSvc.modificaUtentePerId(id, utente);
		return new ResponseEntity<Utente>(u, HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> cancellaUtente(@PathVariable Long id) {
		String msg = utenteSvc.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}
}






