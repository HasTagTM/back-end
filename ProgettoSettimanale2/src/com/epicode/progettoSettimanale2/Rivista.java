	package com.epicode.progettoSettimanale2;

import java.io.Serializable;

public class Rivista extends BaseLetteraria implements Serializable{

	private Periodicita periodicita;
	private Autore autore;
	
    public Rivista(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicita, Autore autore) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
        this.setAutore(autore); 
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

	
	public Autore getAutore() {
		// TODO Auto-generated method stub
		return autore;
	}

	@Override
	public String toString() {
		return "Rivista periodicita=" + periodicita + " autore: " + autore + "titolo: " + super.getTitolo() + "con anno di pubblicazione" + super.getAnnoPubblicazione();
	}
	




	
}
