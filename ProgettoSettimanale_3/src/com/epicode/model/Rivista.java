package com.epicode.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.epicode.enumerated.Periodicita;

@Entity
public class Rivista extends Catalogo{
	
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Rivista(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Rivista() {
		super();
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", getPeriodicita()=" + getPeriodicita() + ", getCodiceISBN()="
				+ getCodiceISBN() + ", getTitolo()=" + getTitolo() + ", getAnnoPubblicazione()="
				+ getAnnoPubblicazione() + ", getNumeroPagine()=" + getNumeroPagine() +"]";
	}


	
}
