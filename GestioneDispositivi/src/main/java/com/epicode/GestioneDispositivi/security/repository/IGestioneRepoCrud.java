package com.epicode.GestioneDispositivi.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.epicode.GestioneDispositivi.security.entity.User;

@Repository
public interface IGestioneRepoCrud extends CrudRepository<User, Long>{

	public boolean existsByEmail(String email);
	
}
