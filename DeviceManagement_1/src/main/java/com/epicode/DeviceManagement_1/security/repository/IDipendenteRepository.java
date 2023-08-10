package com.epicode.DeviceManagement_1.security.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.DeviceManagement_1.security.entity.Dipendente;

@Repository
public interface IDipendenteRepository extends JpaRepository<Dipendente, Long>{
	
	// Metodo per ottenere tutti i dipendenti con un determinato ruolo aziendale
    List<Dipendente> findByRuoloAziendale(String ruoloAziendale);

    // Metodo per ottenere tutti i dipendenti con un determinato reparto
    List<Dipendente> findByReparto(String reparto);

    // Metodo per ottenere tutti i dipendenti assunti prima di una data specificata
    List<Dipendente> findByDataAssunzioneBefore(Date dataAssunzione);

    // Metodo per ottenere tutti i dipendenti assunti dopo una data specificata
    List<Dipendente> findByDataAssunzioneAfter(Date dataAssunzione);

    // Metodo per ottenere tutti i dipendenti assunti tra due date specificate
    List<Dipendente> findByDataAssunzioneBetween(Date startDate, Date endDate);

    // Metodo per ottenere tutti i dipendenti con un determinato reparto e ruolo aziendale
    List<Dipendente> findByRepartoAndRuoloAziendale(String reparto, String ruoloAziendale);

    // Metodo per ottenere tutti i dipendenti con un determinato reparto ordinati per data di assunzione in ordine crescente
    List<Dipendente> findByRepartoOrderByDataAssunzioneAsc(String reparto);

    // Metodo per ottenere tutti i dipendenti con un determinato reparto ordinati per data di assunzione in ordine decrescente
    List<Dipendente> findByRepartoOrderByDataAssunzioneDesc(String reparto);

	Dipendente findByNome(String nomeUtente);

	
}
