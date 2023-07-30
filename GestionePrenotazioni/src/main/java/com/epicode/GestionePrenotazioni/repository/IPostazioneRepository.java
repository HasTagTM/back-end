package com.epicode.GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.GestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.GestionePrenotazioni.models.Postazione;


@Repository
public interface IPostazioneRepository extends JpaRepository<Postazione, Long>{

	List<Postazione> findByTipoAndEdificio_City(TipoPostazione tipo, String city);
	
}
