package com.epicode.DeviceManagement.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.DeviceManagement.security.entity.Dipendente;
import com.epicode.DeviceManagement.security.service.DipendenteService;

@RestController
@RequestMapping("/api/dipendente/")
public class DipendenteController {

	@Autowired DipendenteService dipendenteSvc;
	
	@GetMapping
	public ResponseEntity<List<Dipendente>> getAllDipendenti(){
		return new ResponseEntity<List<Dipendente>>(dipendenteSvc.getAllDipendenti(), HttpStatus.OK);
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Dipendente>> getAllPageableDipendenti(Pageable pageable){
		Page<Dipendente> listaDipendenti = dipendenteSvc.getAllPageable(pageable);
		ResponseEntity<Page<Dipendente>> resp = new ResponseEntity<Page<Dipendente>>(listaDipendenti, HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dipendente> getDipendenteById(@PathVariable Long id){
		return new ResponseEntity<Dipendente>(dipendenteSvc.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Dipendente> createDipendente(@RequestBody Dipendente dipendente){
		Dipendente d = dipendenteSvc.createDipendente(dipendente);
		return new ResponseEntity<Dipendente>(d, HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Dipendente> updateDipendente(@PathVariable Long id, @RequestBody Dipendente dipendente) {
		Dipendente d = dipendenteSvc.updateDipendente(id, dipendente);
		return new ResponseEntity<Dipendente>(d, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDipendente(@PathVariable Long id){
		String msg = dipendenteSvc.deleteDipendenteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
