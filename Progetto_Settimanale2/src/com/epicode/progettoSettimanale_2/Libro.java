package com.epicode.progettoSettimanale_2;

public class Libro extends BaseLetteraria{
	private Autore autore;
	private Genere genere;
	
	public Libro(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Autore autore,
			Genere genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
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
