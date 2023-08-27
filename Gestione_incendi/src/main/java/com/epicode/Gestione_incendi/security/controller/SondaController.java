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

import com.epicode.Gestione_incendi.security.entity.Sonda;
import com.epicode.Gestione_incendi.security.service.SondaService;

@RestController
@RequestMapping("/api/sonda")
public class SondaController {
	
	@Autowired SondaService sondaSvc;

	@GetMapping("/sonda")
	public ResponseEntity<List<Sonda>> getSonda() {
		List<Sonda> listaUtenti = sondaSvc.getAllSonde();
		ResponseEntity<List<Sonda>> rispostaAlFront = new ResponseEntity<List<Sonda>>(listaUtenti, HttpStatus.OK);
		return rispostaAlFront;

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getSondaById(@PathVariable Long id) {
		Sonda u = sondaSvc.sondaId(id);
		return new ResponseEntity<Sonda>(u, HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<?> creaSonda(@RequestBody Sonda utente) {
		Sonda u = sondaSvc.creaSonda(utente);
		return new ResponseEntity<Sonda>(u, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modificaSonda(@PathVariable Long id, @RequestBody Sonda sonda) throws Exception{
		Sonda s = sondaSvc.modificaSondaPerId(id, sonda);
		return new ResponseEntity<Sonda>(s, HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminaSonda(@PathVariable Long id) {
		String msg = sondaSvc.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}
}
