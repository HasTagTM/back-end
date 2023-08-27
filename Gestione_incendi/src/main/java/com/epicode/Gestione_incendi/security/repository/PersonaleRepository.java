package com.epicode.Gestione_incendi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Gestione_incendi.security.entity.Personale;

@Repository
public interface PersonaleRepository extends JpaRepository<Personale, Long>{

}
