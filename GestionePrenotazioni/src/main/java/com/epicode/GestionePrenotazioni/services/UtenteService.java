package com.epicode.GestionePrenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.models.Utente;
import com.epicode.GestionePrenotazioni.repository.IUtenteRepository;

@Service
public class UtenteService {

	@Autowired @Qualifier("crea_utente") private ObjectProvider<Utente> utenteProvider;
	@Autowired IUtenteRepository utenteRepo;
	
	public void creaUtente() {
		utenteProvider.getObject().getUserName();
		utenteProvider.getObject().getNomeCompleto();
		utenteProvider.getObject().getEmail();
	}
	
	public void findAll() {
		utenteRepo.findAll().forEach(p -> System.out.println(p));
	}
	
	public Utente findPostazioneById(Long id) {
		return utenteRepo.findById(id).get();
	}
	
	public void updatePostazione(Utente u) {
		utenteRepo.save(u);
	}
	
	public void removePostazione(Utente u) {
		utenteRepo.save(u);
	}
}
