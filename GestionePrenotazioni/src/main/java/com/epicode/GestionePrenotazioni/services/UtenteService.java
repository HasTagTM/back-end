package com.epicode.GestionePrenotazioni.services;

import java.util.List;

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
	
	public Utente creaUtente(String userName, String nomeCompleto, String email) {
		Utente utente = utenteProvider.getObject();
		utente.setUserName(userName);
		utente.setNomeCompleto(nomeCompleto);
		utente.setEmail(email);
		System.out.println("UTENTE USERNAME: " + utente.getUserName() + " UTENTE NOME_COMPLETO: " + utente.getNomeCompleto() + " UTENTE EMAIL: " + utente.getEmail() + " creato UTENTE con successo");
		utenteRepo.save(utente);
		return utente;
	}
	
	public List<Utente> findAll() {
		return (List<Utente>) utenteRepo.findAll();
	}

	public String findById(Long id) {
		return utenteRepo.findById(id).get().getNomeCompleto().toString();
	}

	public void deleteById(Long id) {
		utenteRepo.deleteById(id);
		System.out.println("utente eliminato");
	}
	
	public void updateUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println("utente aggiornato");
	}
	
	public void deleteByUtente(Utente u) {
		utenteRepo.delete(u);
		System.out.println("utente eliminato");
	}


	public void deleteAll() {
		utenteRepo.deleteAll();
		System.out.println("utenti eleiminati");
	}
	
}
