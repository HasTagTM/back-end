package com.epicode.progettoSettimanale_2;



public class Rivista extends BaseLetteraria{
	
	private Autore autore;
	private Periodicita periodicita;
	

	public Rivista(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// TODO Auto-generated constructor stub
	}



	public Rivista(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Autore autore,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.periodicita = periodicita;
	}



	public Autore getAutore() {
		return autore;
	}



	public void setAutore(Autore autore) {
		this.autore = autore;
	}



	public Periodicita getPeriodicita() {
		return periodicita;
	}



	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}



	@Override
	public String toString() {
		return "Rivista [autore=" + autore + ", periodicita=" + periodicita + ", getAutore()=" + getAutore()
				+ ", getPeriodicita()=" + getPeriodicita() + ", getCodiceISBN()=" + getCodiceISBN() + ", getTitolo()="
				+ getTitolo() + ", getAnnoPubblicazione()=" + getAnnoPubblicazione() + ", getNumeroPagine()="
				+ getNumeroPagine() +"]";
	}





	
}
