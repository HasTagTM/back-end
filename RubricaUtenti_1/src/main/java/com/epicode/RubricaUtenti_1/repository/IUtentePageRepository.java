package com.epicode.RubricaUtenti_1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.epicode.RubricaUtenti_1.model.Utente;

@Repository
public interface IUtentePageRepository extends PagingAndSortingRepository<Utente, Long>{

	
	
}
