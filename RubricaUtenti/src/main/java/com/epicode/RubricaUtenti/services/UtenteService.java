package com.epicode.RubricaUtenti.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.RubricaUtenti.models.Utente;
import com.epicode.RubricaUtenti.repository.IUtenteRepository;

@Service
public class UtenteService {

	@Autowired IUtenteRepository utenteRepo;
	@Autowired @Qualifier("creaUtente") private ObjectProvider<Utente> utenteProvider;

	public Utente creaUtente(String nome, String cognome, Integer age, String email) {
		Utente utente = utenteProvider.getObject();
		utente.setNome(cognome);
		utente.setCognome(cognome);
		utente.setAge(age);
		utente.setEmail(email);
		utenteRepo.save(utente);
		System.out.println("utente creato con successo");
		return utente;
	}

	public List<Utente> findAll() {
		return utenteRepo.findAll();
	}

	public Optional<Utente> findById(Long id) {
		return utenteRepo.findById(id);
	}

	public void deleteById(Long id) {
		utenteRepo.deleteById(id);
	}

	public Utente getById(Long id) {
		return utenteRepo.getById(id);
	}

	public void delete(Utente entity) {
		utenteRepo.delete(entity);
	}

	public void deleteAll() {
		utenteRepo.deleteAll();
	}
	
}

