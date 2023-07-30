package com.epicode.GestionePrenotazioni.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.models.Utente;


@Configuration
public class Configurations {

	@Bean("crea_utente")
	@Scope("prototype")
	public Utente creaUtente() {
		return new Utente();
	}
	
	
	
	@Bean("crea_postazione")
	@Scope("prototype")
	public Postazione creaPostazione() {
		return new Postazione();
	}
	
	
	@Bean("crea_edificio")
	@Scope("prototype")
	public Edificio creaEdificio() {
		return new Edificio();
	}
	
	@Bean("crea_prenotazione")
	@Scope("prototype")
	public Prenotazione creaPrenotazione() {
		return new Prenotazione();
	}
	
}
