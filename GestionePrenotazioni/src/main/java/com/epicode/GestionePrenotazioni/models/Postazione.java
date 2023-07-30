package com.epicode.GestionePrenotazioni.models;

import com.epicode.GestionePrenotazioni.enumerated.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codiceUnivoco;
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	private int numeroMassimoOccupanti;
	
	@ManyToOne
	private Edificio edificio;

	public Postazione(String codiceUnivoco, String descrizione, TipoPostazione tipo, int numeroMassimoOccupanti,
			Edificio edificio) {
		super();
		this.codiceUnivoco = codiceUnivoco;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
		this.edificio = edificio;
	}
	
}
