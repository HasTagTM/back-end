package com.epicode.GestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.GestionePrenotazioni.models.Prenotazione;

public interface IPrenotazioneRepository extends JpaRepository<Prenotazione, Long>{

}
