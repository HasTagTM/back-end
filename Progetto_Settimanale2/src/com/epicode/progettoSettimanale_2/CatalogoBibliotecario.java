package com.epicode.progettoSettimanale_2;

import java.util.ArrayList;
import java.util.List;

public class CatalogoBibliotecario {
		
	private static List<BaseLetteraria> catalogo;

	
	public CatalogoBibliotecario(BaseLetteraria archivio) {
		super();
		this.catalogo = catalogo;
	}
	
	
	public CatalogoBibliotecario() {
		catalogo = new ArrayList<>();
	}


	public static void aggiungiElemento(BaseLetteraria articolo) {
		catalogo.add(articolo);
		
	}

	public static void RimuoviElemento(String codiceISBN) {
		catalogo.removeIf(articolo -> articolo.getCodiceISBN().equals(codiceISBN));

	}

	public static void stampaCatalogo() {
		for(BaseLetteraria articolo : catalogo){
			System.out.println(articolo.toString());
		}
	}
	
	public static List<BaseLetteraria> ricercaPerAutore(Autore autore) {
		List<BaseLetteraria> risultati = new ArrayList<>();

		for(BaseLetteraria elemento : catalogo) {
			if(elemento.getAutore().equals(autore)) {
				Autore autoreElemento = elemento.getAutore();
				System.out.print(elemento.toString());
			}
		}
		return risultati;
	}
	public static List<BaseLetteraria> ricercaPerAnno(int anno) {
		List<BaseLetteraria> risultati = new ArrayList<>();

		for(BaseLetteraria elemento : catalogo) {
			if(elemento.getAnnoPubblicazione().equals(anno)) {
				int annoPubblicazione = elemento.getAnnoPubblicazione();
				System.out.print(elemento.toString());
			}
		}
		return risultati;
	}
	
	@Override
	public String toString() {
		return "CatalogoBibliotecario [archivio=" + catalogo + "]";
	}



	
}
