package com.epicode.GestionePrenotazioni.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.GestionePrenotazioni.models.Postazione;

public interface IPostazioneRepository extends JpaRepository<Postazione, Long>{

	

}
