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
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String userName;
	private String nomeCompleto;
	private String email;
	
	public Utente(String userName, String nomeCompleto, String email) {
		super();
		this.userName = userName;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
}
