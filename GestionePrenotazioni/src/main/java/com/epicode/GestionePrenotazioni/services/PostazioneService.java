package com.epicode.GestionePrenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.repository.IPostazioneRepository;

@Service
public class PostazioneService {

	@Autowired @Qualifier("crea_postazione") ObjectProvider<Postazione> postazioneProvider;
	@Autowired IPostazioneRepository postazioneRepo;
	
	public void creaPostazione() {
		postazioneProvider.getObject().getDescrizione();
		postazioneProvider.getObject().getTipo();
		postazioneProvider.getObject().getNumeroMassimoOccupanti();
		postazioneProvider.getObject().getEdificio();
	}
	
	public void findAll() {
		postazioneRepo.findAll().forEach(p -> System.out.println(p));
	}
	
	public Postazione findPostazioneById(Long id) {
		return postazioneRepo.findById(id).get();
	}
	
	public void updatePostazione(Postazione p) {
		postazioneRepo.save(p);
	}
	
	public void removePostazione(Postazione p) {
		postazioneRepo.save(p);
	}
}

