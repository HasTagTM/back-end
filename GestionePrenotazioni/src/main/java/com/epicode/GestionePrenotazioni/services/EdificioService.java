package com.epicode.GestionePrenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.repository.IEdificioRepository;

@Service
public class EdificioService {

	@Autowired @Qualifier("crea_edificio") private ObjectProvider<Edificio> edificioProvider;
	@Autowired IEdificioRepository edificioRepo;
	
	public void creaEdificio() {
		edificioProvider.getObject().getNome();
		edificioProvider.getObject().getIndirizzo();
		edificioProvider.getObject().getCity();
	}
	
	public void findAll() {
		edificioRepo.findAll().forEach(e -> System.out.println(e));
	}
	
	public Edificio findPostazioneById(Long id) {
		return edificioRepo.findById(id).get();
	}
	
	public void updatePostazione(Edificio e) {
		edificioRepo.save(e);
	}
	
	public void removePostazione(Edificio e) {
		edificioRepo.save(e);
	}
}
