package com.epicode.GestioneDispositivi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestioneDispositivi.security.entity.Dispositivo;

@Repository
public interface IGestioneDispositiviPageable extends JpaRepository<Dispositivo, Long>{

}
