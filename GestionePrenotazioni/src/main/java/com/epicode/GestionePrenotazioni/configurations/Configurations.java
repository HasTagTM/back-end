package com.epicode.GestionePrenotazioni.configurations;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GestionePrenotazioni.enumerated.TipoPostazione;
import com.epicode.GestionePrenotazioni.models.Edificio;
import com.epicode.GestionePrenotazioni.models.Postazione;
import com.epicode.GestionePrenotazioni.models.Prenotazione;
import com.epicode.GestionePrenotazioni.models.Utente;

import jakarta.persistence.ManyToOne;

@Configuration
public class Configurations {

	@Bean("crea_utente")
	@Scope("prototype")
	public Utente creaUtente(String userName, String nomeCompleto, String email) {
		Utente u = new Utente();
		u.setUserName(userName);
		u.setNomeCompleto(nomeCompleto);
		u.setEmail(email);
		return u;
	}
	
	
	
	@Bean("crea_post_sala_riunioni")
	@Scope("prototype")
	public Postazione creaPostazioneSalaRiunioni(String codiceUnivoco, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
		Postazione p = new Postazione();
		p.setCodiceUnivoco(codiceUnivoco);
		p.setDescrizione(descrizione);
		p.setEdificio(edificio);
		p.setNumeroMassimoOccupanti(numeroMassimoOccupanti);
		p.setTipo(tipo.SALA_RIUNIONI);
		
		return p;
	}
	
	@Bean("crea_post_sala_privata")
	@Scope("prototype")
	public Postazione creaPostazionePrivata(String codiceUnivoco, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
		Postazione p = new Postazione();
		p.setCodiceUnivoco(codiceUnivoco);
		p.setDescrizione(descrizione);
		p.setEdificio(edificio);
		p.setNumeroMassimoOccupanti(numeroMassimoOccupanti);
		p.setTipo(tipo.PRIVATO);
		
		return p;
	}
	
	@Bean("crea_post_sala_openSpace")
	@Scope("prototype")
	public Postazione creaPostazioneOpenSpace(String codiceUnivoco, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti, Edificio edificio) {
		Postazione p = new Postazione();
		p.setCodiceUnivoco(codiceUnivoco);
		p.setDescrizione(descrizione);
		p.setEdificio(edificio);
		p.setNumeroMassimoOccupanti(numeroMassimoOccupanti);
		p.setTipo(tipo.OPENSPACE);
		
		return p;
	}
	
	@Bean("crea_edificio")
	@Scope("prototype")
	public Edificio creaEdificio(String nome, String indirizzo, String city) {
		Edificio e = new Edificio();
		e.setNome(nome);
		e.setIndirizzo(indirizzo);
		e.setCity(city);
		return e;
	}
	
	@Bean("crea_prenotazione")
	@Scope("prototype")
	public Prenotazione creaPrenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
		Prenotazione pr = new Prenotazione();
		pr.setDataPrenotazione(dataPrenotazione);
		pr.setUtente(utente);
		pr.setPostazione(postazione);
		return pr;
	}
	
	
}












