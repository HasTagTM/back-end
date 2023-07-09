package com.epicode.progettoSettimanale_2;

public class Autore {
	private String nome;
	private String cognome;
	private Integer eta;
	
	public Autore(String nome, String cognome, Integer eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
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

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Autore [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + ", getEta()=" + getEta() + "]";
	}
	
}
