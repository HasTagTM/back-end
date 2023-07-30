package com.epicode.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.models.Utente;

@Repository
public interface IPrenotazioneRepository extends JpaRepository<Prenotazione, Long>{

	List<Prenotazione> findByPostazione(Postazione postazione);

	List<Prenotazione> findByUtente(Utente utente);

}
