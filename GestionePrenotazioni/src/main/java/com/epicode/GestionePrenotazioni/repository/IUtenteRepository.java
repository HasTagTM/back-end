package com.epicode.GestionePrenotazioni.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.models.Utente;

@Repository
public interface IUtenteRepository extends JpaRepository<Utente, Long>{
	
}
