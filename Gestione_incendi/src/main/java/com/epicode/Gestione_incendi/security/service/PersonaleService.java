package com.epicode.Gestione_incendi.security.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Gestione_incendi.security.entity.Personale;
import com.epicode.Gestione_incendi.security.entity.User;
import com.epicode.Gestione_incendi.security.repository.PersonaleRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonaleService {
	
	@Autowired PersonaleRepository personaleRepo;
	@Autowired @Qualifier("creaPersonale") private ObjectProvider<Personale> personaleProvider;
	
	public Personale creaPersonale(User user) {
		Personale p = new Personale();
		p.setVigileDelFuco(user);
		personaleRepo.save(p);
		return p;
	}

	// Metodo getAll che utilizza il repository CrudRepository
	public List<Personale> getAllPersonale(){
		return personaleRepo.findAll();
	}
	
	public Personale personaleId(Long id) {
		if(!personaleRepo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		return personaleRepo.findById(id).get();
	}
	
	public Personale creaPersonale(Personale u) {
		return personaleRepo.save(u);
	}
	
	public Personale modificaUtentePerId(Long id, Personale utente) throws Exception{
		if(!personaleRepo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		if(id != utente.getId()) {
			throw new Exception("Id and contact do not match");
		}
		return personaleRepo.save(utente);
	}
	
	public String deleteById(Long id) {
		if(!personaleRepo.existsById(id)) {
			throw new EntityNotFoundException("Peronale not exists!!!");
		}
		Personale p = personaleId(id);
		personaleRepo.delete(p);
		return "personale eliminato con successo!";
	}
	
}
