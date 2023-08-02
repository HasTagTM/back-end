package com.epicode.RubricaUtenti_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.RubricaUtenti_1.model.Utente;

@Repository
public interface IUtenteRepository extends JpaRepository<Utente, Long>{

	boolean existsByEmail(String email);

}
