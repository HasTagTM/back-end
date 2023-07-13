package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import Enumerated.Sesso;

@Entity
@Table(name = "persone")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String email;
	@Column(name = "data_di_nascita", nullable = false)
	private LocalDate dataDiNascita;
	@Column(nullable = false)
	private Sesso sesso;
	
	@Column(name = "lista_partecipanti")
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Evento eventi;

}
