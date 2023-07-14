package com.epicode.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Catalogo {
	
	@Id
	private String codiceISBN;
	private String titolo;
	private Integer annoPubblicazione;
	private Integer numeroPagine;
	
	public Catalogo(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super();
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public Catalogo() {
		super();
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

	public void setTitolo(String titolo) {
		this.titolo = titolo;
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
		return "Catalogo [codiceISBN=" + codiceISBN + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + ", getCodiceISBN()=" + getCodiceISBN() + ", getTitolo()="
				+ getTitolo() + ", getAnnoPubblicazione()=" + getAnnoPubblicazione() + ", getNumeroPagine()="
				+ getNumeroPagine() + "]";
	}
	
}
