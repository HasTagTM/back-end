package com.epicode.GestionePrenotazioni.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate dataPrenotazione;
	
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	private Postazione postazione;

	public Prenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
		super();
		this.dataPrenotazione = dataPrenotazione;
		this.utente = utente;
		this.postazione = postazione;
	}
	
}
