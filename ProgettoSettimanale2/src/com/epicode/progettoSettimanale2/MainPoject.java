package com.epicode.progettoSettimanale2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPoject {

		

	public static void main(String[] args) {


		Logger log = LoggerFactory.getLogger(MainPoject.class);


		
		String folderPath = "C:\\Users\\sahra\\Desktop\\file_backend";
		File folder = new File(folderPath);
		folder.mkdir();
		
		Autore autore1 = new Autore("Mario", "Rossi", 45);
		Autore autore2 = new Autore("Luca", "Verdi", 25);
		Autore autore3 = new Autore("Hassan", "Saraui", 35);
		Autore autore4 = new Autore("Mirco", "Bianchi", 30);
		Autore autore5 = new Autore("Maria", "Esposito", 26);
		Autore autore6 = new Autore("Giudo", "Becchi", 29);
		Autore autore7 = new Autore("Gianluca", "Calabrone", 36);
		

		Libro libro1 = new Libro("1A2B3C4D", "Il Signore Degli Anelli", 2022, 355, autore1, Genere.AZIONE);
		Libro libro2 = new Libro("FS54F5S6", "L'Isola Perduta", 2020, 355, autore2, Genere.HORROR);
		Libro libro3 = new Libro("F454SDF9", "L'Isola che non c'è", 2022, 355, autore3, Genere.ROMANTICO);
		Libro libro4 = new Libro("F5DSF4DA", "One Piece Il Tesoro Dei Pirati", 2022, 355, autore4, Genere.ANIME);
		Libro libro5 = new Libro("F54DFA5D", "Padre Ricco Padre Povero", 2018, 355, autore5, Genere.AZIONE);
		
		Rivista rivista1 = new Rivista("15SD545FD", "OnePiece", 2022, 25, Periodicita.MENSILE, autore4);
		Rivista rivista2 = new Rivista("5SDF5H545", "Vivera Sani", 2023, 40, Periodicita.SETTIMANALE, autore5);
		Rivista rivista3 = new Rivista("GDG84H5GF", "Putin e l'Ucraina", 2022, 55, Periodicita.SEMESTRALE, autore6);
		Rivista rivista4 = new Rivista("8G84D54GF", "MotoJP", 2018, 28, Periodicita.SEMESTRALE, autore7);
		Rivista rivista5 = new Rivista("8FD5G5FG8", "Formula1", 2016, 20, Periodicita.MENSILE, autore1);
		Rivista rivista6 = new Rivista("D5G4FDFD8", "Volley-ball Maschile", 2023, 36, Periodicita.SETTIMANALE, autore2);
		
		CatalogoBibliotecario catalogo = new CatalogoBibliotecario();

	    // Aggiunta di elementi al catalogo
	    catalogo.aggiungiElemento(libro1);
	    catalogo.aggiungiElemento(libro2);
	    catalogo.aggiungiElemento(libro3);
	    catalogo.aggiungiElemento(libro4);
	    catalogo.aggiungiElemento(libro5);
	    catalogo.aggiungiElemento(rivista1);
	    catalogo.aggiungiElemento(rivista2);
	    catalogo.aggiungiElemento(rivista3);
	    catalogo.aggiungiElemento(rivista4);
	    catalogo.aggiungiElemento(rivista5);
	    catalogo.aggiungiElemento(rivista6);
	    
	    //catalogo.stampaNelCatalogo();

	    // Rimozione di un elemento dato il codice ISBN
	    catalogo.rimuoviElementoByISBN("1A2B3C4D");
	    catalogo.stampaNelCatalogo();
	    

	    // Ricerca per ISBN
	    BaseLetteraria elemento = catalogo.ricercaPerISBN("FS54F5S6");
	    log.info("questo e l'articolo " + elemento + "con codice FS54F5S6");

	    // Ricerca per anno di pubblicazione
	    List<BaseLetteraria> elementiAnno = catalogo.ricercaPerAnnoPubblicazione(2022);
	    log.info("questo sono gli articoli dell'anno " + 2022 + " " + elementiAnno);

	    // Ricerca per autore
	    List<BaseLetteraria> elementiAutore = catalogo.ricercaPerAutore(autore1);
	    log.info("Questi sono gli articoli dell'autore " + elementiAutore);


	    catalogo.salvataggioSuDisco(folderPath);
	    catalogo.caricamentoDalDisco(folderPath);
		

	}


	
}
 