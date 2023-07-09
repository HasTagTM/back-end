package com.epicode.progettoSettimanale2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalogoBibliotecario {
		
	
	Logger log = LoggerFactory.getLogger(CatalogoBibliotecario.class);
	private List<BaseLetteraria> catalogo;
 
    public CatalogoBibliotecario() {
        catalogo = new ArrayList<>();
    }



    
    public void aggiungiElemento(BaseLetteraria articolo) {
        catalogo.add(articolo);
    }

    public void rimuoviElementoByISBN(String codiceISBN) {
        catalogo.removeIf(articolo -> articolo.getCodiceISBN().equals(codiceISBN));
    }
 
    public BaseLetteraria ricercaPerISBN(String codiceISBN) {
        return catalogo.stream()
                       .filter(articolo -> articolo.getCodiceISBN().equals(codiceISBN))
                       .findFirst()
                       .orElse(null);
    }

    public List<BaseLetteraria> ricercaPerAnnoPubblicazione(int annoPubblicazione) {
        return catalogo.stream()
                       .filter(articolo -> articolo.getAnnoPubblicazione() == annoPubblicazione)
                       .collect(Collectors.toList());
    }
    
    public List<BaseLetteraria> ricercaPerAutore(Autore autore) {
        return catalogo.stream()
                       .filter(articolo -> articolo.getAutore().equals(autore))
                       .collect(Collectors.toList());
    }
    


    public void stampaNelCatalogo() {
        for (BaseLetteraria articolo : catalogo) {
            System.out.println(articolo.toString());
        } 
    }

    
    
    public void salvataggioSuDisco(String filePath) { 
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(catalogo);
            System.out.println("Salvataggio su disco completato.");
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio su disco: " + e.getMessage());
        }
    }

    public void caricamentoDalDisco(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            catalogo = (List<BaseLetteraria>) ois.readObject();
            System.out.println("Caricamento dal disco completato.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Errore durante il caricamento dal disco: " + e.getMessage());
        }
    }

    
	@Override
	public String toString() {
		return "CatalogoBibliotecario catalogo=" + catalogo + "articolo";
	}
	
}
