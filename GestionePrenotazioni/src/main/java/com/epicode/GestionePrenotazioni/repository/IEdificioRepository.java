package com.epicode.GestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.models.Edificio;

@Repository
public interface IEdificioRepository extends JpaRepository<Edificio, Long>{

}
