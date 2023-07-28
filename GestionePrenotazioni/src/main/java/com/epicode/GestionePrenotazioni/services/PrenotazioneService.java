package com.epicode.GestionePrenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.repository.IPrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired @Qualifier("crea_prenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired IPrenotazioneRepository prenotazioneRepo;
	
	
	public void creaPrenotazione() {
		prenotazioneProvider.getObject().getDataPrenotazione();
		prenotazioneProvider.getObject().getUtente();
		prenotazioneProvider.getObject().getPostazione();
	}
	
	public void findAll() {
		prenotazioneRepo.findAll().forEach(pr -> System.out.println(pr));
	}
	
	public Prenotazione findPostazioneById(Long id) {
		return prenotazioneRepo.findById(id).get();
	}
	
	public void updatePostazione(Prenotazione pr) {
		prenotazioneRepo.save(pr);
	}
	
	public void removePostazione(Prenotazione pr) {
		prenotazioneRepo.save(pr);
	}
	
}
