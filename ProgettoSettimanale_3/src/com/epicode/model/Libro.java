package com.epicode.model;

import javax.persistence.Entity;

@Entity
public class Libro extends Catalogo{

	private String autore;
	private String genere;
	
	public Libro(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	

	public Libro() {
		super();
	}


	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}


	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", getAutore()=" + getAutore() + ", getGenere()="
				+ getGenere() + ", getCodiceISBN()=" + getCodiceISBN() + ", getTitolo()=" + getTitolo()
				+ ", getAnnoPubblicazione()=" + getAnnoPubblicazione() + ", getNumeroPagine()=" + getNumeroPagine()
				+ "]";
	}
	
	
}
