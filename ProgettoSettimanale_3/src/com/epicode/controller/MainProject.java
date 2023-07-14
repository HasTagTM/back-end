package com.epicode.controller;

import java.time.LocalDate;
import java.util.List;


import com.epicode.dao.ElementoCatalogoDAO;
import com.epicode.dao.PrestitoDAO;
import com.epicode.dao.UtenteDAO;
import com.epicode.enumerated.Periodicita;
import com.epicode.model.Catalogo;
import com.epicode.model.Libro;
import com.epicode.model.Prestito;
import com.epicode.model.Rivista;
import com.epicode.model.Utente;

public class MainProject {

	public static void main(String[] args) {
		 	Catalogo libro = new Libro();
	        //libro.setCodiceISBN("123456789");
	        //libro.setTitolo("Il signore degli anelli");
	        //libro.setAnnoPubblicazione(1954);
	        //libro.setNumeroPagine(1178);
	        //((Libro) libro).setAutore("J.R.R. Tolkien");
	        //((Libro) libro).setGenere("Fantasy");
		 	

	        Catalogo rivista = new Rivista();
	        //rivista.setCodiceISBN("987654321");
	        //rivista.setTitolo("National Geographic");
	        //rivista.setAnnoPubblicazione(1888);
	        //rivista.setNumeroPagine(100);
	        ((Rivista) rivista).setPeriodicita(Periodicita.MENSILE);

	        Utente utente = new Utente();
	        //utente.setNumeroTessera("0001");
	        //utente.setNome("Mario");
	        //utente.setCognome("Rossi");
	        //utente.setDataDiNascita(LocalDate.of(1990, 1, 1));

	        
	        ElementoCatalogoDAO elementoCatalogoDAO = new ElementoCatalogoDAO();
	        //elementoCatalogoDAO.save(libro);
	        //elementoCatalogoDAO.save(rivista);
	        

	        
	        UtenteDAO utenteDAO = new UtenteDAO();
	        //utenteDAO.save(utente);

	        PrestitoDAO prestitoDAO = new PrestitoDAO();
	        Prestito prestito = new Prestito();
	        //prestitoDAO.save(prestito);
	        
	        
	        Catalogo libroTrovato = elementoCatalogoDAO.findByISBN("123456789");
	        System.out.println(libroTrovato);
	        
	        List<Catalogo> libriAnno = elementoCatalogoDAO.findByAnnoPubblicazione("1954");
	        System.out.println(libriAnno);
	        
	        List<Catalogo> libriAutore = elementoCatalogoDAO.findByAutore("J.R.R. Tolkien");
	        System.out.println(libriAutore);
	        
	        List<Catalogo> libriTitolo = elementoCatalogoDAO.findByTitolo("Il signore degli anelli");
	        System.out.println(libriTitolo);
	        
	        Utente utenteTrovato = utenteDAO.findByNumeroTessera("0001");
	        System.out.println(utenteTrovato);
	        
	        List<Prestito> prestitiInCorso = prestitoDAO.findPrestitiInCorsoByUtente("0001");
	        System.out.println(prestitiInCorso);
	        
	        List<Prestito> prestitiScadutiNonRestituiti = prestitoDAO.findPrestitiScadutiNonRestituiti();
	        System.out.println(prestitiScadutiNonRestituiti);
	}

}
