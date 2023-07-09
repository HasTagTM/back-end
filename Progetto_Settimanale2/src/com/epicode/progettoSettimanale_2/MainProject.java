package com.epicode.progettoSettimanale_2;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.progettoSettimanale_2.Autore;
import com.epicode.progettoSettimanale_2.Genere;
import com.epicode.progettoSettimanale_2.Libro;
import com.epicode.progettoSettimanale_2.Periodicita;
import com.epicode.progettoSettimanale_2.Rivista;
import com.epicode.progettoSettimanale_2.CatalogoBibliotecario;

public class MainProject {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(MainProject.class);
		CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
		Autore autore1 = new Autore("Mario", "Rossi", 45);
		Autore autore2 = new Autore("Luca", "Verdi", 25);
		Autore autore3 = new Autore("Hassan", "Saraui", 35);
		Autore autore4 = new Autore("Mirco", "Bianchi", 30);
		Autore autore5 = new Autore("Maria", "Esposito", 26);
		Autore autore6 = new Autore("Giudo", "Becchi", 29);
		Autore autore7 = new Autore("Gianluca", "Calabrone", 36);
		

		Libro libro1 = new Libro("1A2B3C4D", "Il Signore Degli Anelli", 2020, 355, autore1, Genere.AZIONE);
		Libro libro2 = new Libro("FS54F5S6", "L'Isola Perduta", 2020, 355, autore2, Genere.HORROR);
		Libro libro3 = new Libro("F454SDF9", "L'Isola che non c'è", 2020, 355, autore3, Genere.ROMANTICO);
		Libro libro4 = new Libro("F5DSF4DA", "One Piece Il Tesoro Dei Pirati", 2022, 355, autore4, Genere.ANIME);
		Libro libro5 = new Libro("F54DFA5D", "Padre Ricco Padre Povero", 2018, 355, autore5, Genere.AZIONE);
		
		Rivista rivista1 = new Rivista("15SD545FD", "OnePiece", 2020, 25, autore6 , Periodicita.MENSILE);
		Rivista rivista2 = new Rivista("5SDF5H545", "Vivera Sani", 2023, 40, autore7, Periodicita.SETTIMANALE);
		Rivista rivista3 = new Rivista("GDG84H5GF", "Putin e l'Ucraina", 2022, 55, autore1, Periodicita.SEMESTRALE);
		Rivista rivista4 = new Rivista("8G84D54GF", "MotoJP", 2018, 28, autore4, Periodicita.SEMESTRALE);
		Rivista rivista5 = new Rivista("8FD5G5FG8", "Formula1", 2016, 20, autore2, Periodicita.MENSILE);
		Rivista rivista6 = new Rivista("D5G4FDFD8", "Volley-ball Maschile", 2023, 36, autore2, Periodicita.SETTIMANALE);
		
		catalogo.aggiungiElemento(rivista1);
		catalogo.aggiungiElemento(rivista2);
		catalogo.aggiungiElemento(rivista3);
		catalogo.aggiungiElemento(rivista4);
		catalogo.aggiungiElemento(libro1);
		catalogo.aggiungiElemento(libro2);
		catalogo.aggiungiElemento(libro3);
		catalogo.aggiungiElemento(libro4);
		
		
		catalogo.RimuoviElemento("8FD5G5FG8");
		
		catalogo.stampaCatalogo();
		catalogo.ricercaPerAutore(autore1);
		catalogo.ricercaPerAnno(2022);
	}


	


}
