package com.epicode.GestionePrenotazioni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Edificio {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String indirizzo;
	private String city;
	
	public Edificio(String nome, String indirizzo, String city) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.city = city;
	}
	
}
