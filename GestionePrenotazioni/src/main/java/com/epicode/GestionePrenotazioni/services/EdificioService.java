package com.epicode.GestionePrenotazioni.services;

import java.util.List;

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
	
	public Edificio creaEdificio(String nome, String indirizzo, String city) {
		Edificio edificio = edificioProvider.getObject();
		edificio.setNome(nome);
		edificio.setIndirizzo(indirizzo);
		edificio.setCity(city);
		edificioRepo.save(edificio);
		System.out.println("EDIFICIO " + edificio.getNome() + " " + edificio.getIndirizzo() + " INDIRIZZO: " + edificio.getIndirizzo() + " CITTA': " + edificio.getCity() +  " creato EDIFICIO con successo");
		return edificio;
	}
	
	public List<Edificio> findAll() {
		return (List<Edificio>) edificioRepo.findAll();
	}
	
	public String findPostazioneById(Long id) {
		return edificioRepo.findById(id).get().getNome().toString();
	}
	
	public void updateEdificio(Edificio e) {
		edificioRepo.save(e);
		System.out.println("edificio aggiornato");
	}

	public void deleteById(Long id) {
		edificioRepo.deleteById(id);
		System.out.println("edificio eliminato");
	}

	public void deleteAll() {
		edificioRepo.deleteAll();
		System.out.println("edifici eliminati");
	}
	
}
