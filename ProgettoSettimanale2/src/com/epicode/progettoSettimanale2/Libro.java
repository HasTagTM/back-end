   package com.epicode.progettoSettimanale2;

import java.io.Serializable;

public class Libro extends BaseLetteraria implements Serializable{

	
	private Autore autore;
	private Genere genere;
	

	    public Libro(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Autore autore, Genere genere) {
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

		public void setGenere(Genere genere) {
			this.genere = genere;
		}

		public Genere getGenere() {
	        return genere;
	    }

		@Override
		public String toString() {
			return "Libro titolo: " + super.getTitolo() +  "autore: " + autore + "con anno di pubblicazione" + super.getAnnoPubblicazione();
		}



}
