package com.epicode.progettoSettimanale_2;

import com.epicode.progettoSettimanale_2.Autore;

public abstract class BaseLetteraria {
	private String codiceISBN;
	private String titolo;
	private Integer annoPubblicazione;
	private Integer numeroPagine;
	public abstract Autore getAutore();
	
	public BaseLetteraria(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String tirolo) {
		this.titolo = tirolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "BaseLetteraria [codiceISBN=" + codiceISBN + ", tirolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
}
