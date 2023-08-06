package com.epicode.DeviceManagement.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.DeviceManagement.security.entity.Dipendente;
import com.epicode.DeviceManagement.security.entity.Dispositivo;
import com.epicode.DeviceManagement.security.entity.Tablet;
import com.epicode.DeviceManagement.security.service.DipendenteService;
import com.epicode.DeviceManagement.security.service.DispositivoService;

@RestController
@RequestMapping("/api/dispositivo/")
public class DispositivoController {

@Autowired DispositivoService dispositivoSvc;
	
	@GetMapping
	public ResponseEntity<List<Dispositivo>> getAllDispositivi(){
		return new ResponseEntity<List<Dispositivo>>(dispositivoSvc.getAllDispositivi(), HttpStatus.OK);
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Dispositivo>> getAllDispositiviPageable(Pageable pageable){
		Page<Dispositivo> listaDispositivi = dispositivoSvc.getAllPageable(pageable);
		ResponseEntity<Page<Dispositivo>> resp = new ResponseEntity<Page<Dispositivo>>(listaDispositivi, HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(dispositivoSvc.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Dispositivo> createDispositivo(@RequestBody Dispositivo dispositivo){
		Dispositivo d = dispositivoSvc.createDispositivo(dispositivo);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.OK);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Dispositivo> updateDispositivo(@PathVariable Long id, @RequestBody Dispositivo dispositivo){
		Dispositivo d = dispositivoSvc.updateDispositivo(id, dispositivo);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeDispositivo(@PathVariable Long id){
		String msg = dispositivoSvc.deleteDispositivoById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	
}
