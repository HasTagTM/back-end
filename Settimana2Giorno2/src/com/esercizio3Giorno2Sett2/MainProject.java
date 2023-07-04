package com.esercizio3Giorno2Sett2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	 

	
	private static Map<String , String> rubrica = new HashMap<String , String>();
	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	public static void main(String[] args) {
		
		inserisciInRubrica("Mario Rossi", "123456789");
		inserisciInRubrica("Luigi Verdi", "987654321");
		inserisciInRubrica("Francesca Neri", "456321789");
		eliminaDaRubrica("Liugi");
		ricercaPerTelefono("123456789");
		ricercaPerNome("Mario");
		stampaRubrica();
		
		
		

	}

	// Scrivere una classe Java che permetta di gestire una rubrica telefonica. La lista dei contatti è realizzata mediante
	// una HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono. Realizzare i metodi per:
	// 1. L'inserimento di una coppia <Nome, telefono>
	
	public static void inserisciInRubrica(String nome , String telefono) {
		rubrica.put(nome , telefono);
		log.info("nome:" + nome + "numero tel:" + telefono);
	}
	
	// 2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
	
	public static void eliminaDaRubrica(String nome) {
		rubrica.remove(nome);
		log.info("questo è il nome della persona:" + nome);
	}
	

	
	// 3. La ricerca di una Persona di cui si conosce il numero di telefono
	
	public static String ricercaPerTelefono(String telefono) {
		Set<String> key = rubrica.keySet();	

		for(String s : key) {
			log.info("questo è il numero di telefono:" + telefono);
		}	
		return telefono;
	}
	
	// 4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
	
	public static void ricercaPerNome(String nome) {
		rubrica.get(nome);
		log.info("questo è il nome della persona:" + nome);
	}
	
	// 5. La stampa di tutti i contatti con nome numero. mantieni il main il piu pulito possibile come da pratica comune
	
	public static void stampaRubrica() {
		log.info("questa e la rubrica");
		
	Set<String> setNum = rubrica.keySet();
	for(String s : setNum) {
		log.info("nome:" + s + "numero:" + rubrica.get(s));
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
