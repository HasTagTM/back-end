package com.epicode.GestionePrenotazioni.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.models.Utente;
import com.epicode.GestionePrenotazioni.repository.IPostazioneRepository;
import com.epicode.GestionePrenotazioni.repository.IPrenotazioneRepository;
import com.epicode.GestionePrenotazioni.repository.IUtenteRepository;

@Service
public class PrenotazioneService {

	@Autowired @Qualifier("crea_prenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired IPrenotazioneRepository prenotazioneRepo;
	@Autowired IUtenteRepository utenteRepo;
	@Autowired IPostazioneRepository postazioneRepo;
	
    
    public Prenotazione creaPrenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
        // Verifica se l'utente può prenotare la postazione per la data specificata
        if (canPrenotarePostazione(utente, dataPrenotazione)) {
            Prenotazione pr = prenotazioneProvider.getObject();
            pr.setDataPrenotazione(dataPrenotazione);
            pr.setUtente(utente);
            pr.setPostazione(postazione);
            prenotazioneRepo.save(pr);
            System.out.println("PRENOTAZIONE DATA: " + pr.getDataPrenotazione() + " PRENOTAZIONE UTENTE: " + pr.getUtente().getUserName() + " PRENOTAZIONE POSTAZIONE: " + pr.getPostazione().getCodiceUnivoco() + " creata PRENOTAZIONE con successo");
            return pr;
        } else {
            System.out.println("L'utente " + utente.getUserName() + " ha già una prenotazione per la data " + dataPrenotazione);
            return null;
        }
    }

    public boolean canPrenotarePostazione(Utente utente, LocalDate dataPrenotazione) {
        List<Prenotazione> prenotazioniUtente = prenotazioneRepo.findByUtente(utente);
        boolean canPrenotare = prenotazioniUtente.stream()
                .noneMatch(p -> p.getDataPrenotazione().isEqual(dataPrenotazione));   
        if (canPrenotare) {
            System.out.println("L'utente " + utente.getUserName() + " può prenotare la postazione per la data " + dataPrenotazione);
        } else {
            System.out.println("L'utente " + utente.getUserName() + " ha già una prenotazione per la data " + dataPrenotazione);
        }
        
        return canPrenotare;
    }

	public void deletePrenotazioniByPostazione(Postazione postazione) {
        List<Prenotazione> prenotazioni = prenotazioneRepo.findByPostazione(postazione);
        prenotazioneRepo.deleteAll(prenotazioni);
        System.out.println("Prenotazioni per la postazione " + postazione.getCodiceUnivoco() + " eliminate");
    }
	
	public List<Prenotazione> findAll() {
		return (List<Prenotazione>) prenotazioneRepo.findAll();
	}

	public void updatePrenotazione(Prenotazione p) {
		prenotazioneRepo.save(p);
		System.out.println("utente aggiornato");
	}
	
	public String findById(Long id) {
		return postazioneRepo.findById(id).get().getCodiceUnivoco().toString();
	}

	public void deleteById(Long id) {
		postazioneRepo.deleteById(id);
		System.out.println("postazione eleiminata");
	}

	public void delete(Postazione P) {
		postazioneRepo.delete(P);
		System.out.println("postazione eliminata");
	}

	public void deleteAll() {
		postazioneRepo.deleteAll();
		System.out.println("postazioni eliminate");
	}
	
}
