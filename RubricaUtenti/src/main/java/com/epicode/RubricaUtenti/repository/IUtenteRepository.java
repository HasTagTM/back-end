package com.epicode.RubricaUtenti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.RubricaUtenti.models.Utente;

@Repository
public interface IUtenteRepository extends JpaRepository<Utente, Long>{

}
