package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	
	@Id
	private String numeroTessera;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;

	public Utente(String numeroTessera, String nome, String cognome, LocalDate dataDiNascita) {
		super();
		this.numeroTessera = numeroTessera;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	
	}
	public Utente() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public String getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(String numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", numeroTessera="
				+ numeroTessera + ", getNome()=" + getNome() + ", getCognome()=" + getCognome()
				+ ", getDataDiNascita()=" + getDataDiNascita() + ", getNumeroTessera()=" + getNumeroTessera()
				+ "]";
	}
	
}
