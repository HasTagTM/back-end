package com.epicode.RubricaUtenti_1.service;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.epicode.RubricaUtenti_1.model.Utente;
import com.epicode.RubricaUtenti_1.repository.IUtentePageRepository;
import com.epicode.RubricaUtenti_1.repository.IUtenteRepository;
import com.github.javafaker.Faker;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {

	@Autowired @Qualifier("creaUtente")private ObjectProvider<Utente> utenteProvider;
	@Autowired @Qualifier("creaUtenteFaker")private ObjectProvider<Utente> utenteProviderFaker;
	@Autowired IUtenteRepository utenteRepo;
	@Autowired IUtentePageRepository UtentePageRepo;
	
	public Utente creaUtente(String name, String surname, String city, String email, Integer age, String password) {
		Utente u = utenteProvider.getObject();
		u.setName(name);
		u.setSurname(surname);
		u.setCity(city);
		u.setEmail(email);
		u.setAge(age);
		u.setPassword(password);
		utenteRepo.save(u);
		return u;
	}
	
	public Utente creaUtenteFaker() {
		Faker faker = new Faker(new Locale("it-IT"));
		Utente u = utenteProvider.getObject();
		String name = faker.name().firstName();
		String surname = faker.name().lastName();
		u.setName(name);
		u.setSurname(surname);
		u.setCity(faker.address().cityName());
		u.setEmail(name.toLowerCase() + "." + surname.toLowerCase() + "example.com");
		u.setAge(faker.number().numberBetween(18 ,35));
		u.setPassword(faker.internet().password());
		utenteRepo.save(u);
		return u;
		
	}
	
	// Metodo getAll che utilizza il repository CrudRepository
	public List<Utente> getAllUtenti(){
		return utenteRepo.findAll();
	}
	
	// Metodo getAll che utilizza il repository PagingAndSortingRepository
	public Page<Utente> getAllUtentiPage(Pageable page){
		return UtentePageRepo.findAll(page);
	}

	public Utente utenteId(Long id) {
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		return utenteRepo.findById(id).get();
	}
	
	public Utente creaFrontUtente(Utente u) {
		if(utenteRepo.existsByEmail(u.getEmail())) {
			throw new EntityExistsException("Contact email exists!!!");
		}
		return utenteRepo.save(u);
	}
	
	public Utente modificaUtentePerId(Long id, Utente utente) throws Exception{
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		if(id != utente.getId()) {
			throw new Exception("Id and contact do not match");
		}
		return utenteRepo.save(utente);
	}
	
	public String deleteById(Long id) {
		if(!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("Contact not exists!!!");
		}
		Utente u = utenteId(id);
		utenteRepo.delete(u);
		return "utente eliminato con successo!";
	}
}
