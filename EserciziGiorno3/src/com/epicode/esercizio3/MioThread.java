package com.epicode.esercizio3;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.esercizio2.MainProgectEsercizio2;

public class MioThread implements Runnable{

	private static Logger log = LoggerFactory.getLogger(MioThread.class);
	
	// 6) assegno a questa classe un array di interi
		private int[] arr;
		
		// 10) aggiungo queste proprietà per far si che l'array possa avere un indice 
		// iniziale e finale cosi da poterlo dividere volendo
		private int indiceIniziale;
		private int indiceFinale;
		// 17) aggiungo lista parziali come una lista Integer dato che lo è
		private List<Integer> listaParziali;
	
		
	// 7) genero il costruttore cosi da poter costruire oggetti similari
		
	public MioThread(int[] arr , int indiceIniziale , int indiceFinale ,List<Integer> listaParziali) {

			this.arr = arr;
			
			// 11) aggiungo queste proprietà aggiunte
			this.indiceIniziale = indiceIniziale;
			this.indiceFinale = indiceFinale;
			// 18) aggiungo ovviamente anche listaParziali
			this.listaParziali = listaParziali;
		}
	
	// 8) genero il metofo run()
	// @Override
	// public void run() {   9) // questo metodo del Thread lo dovro avviare poi nel main con start()

		// inizializzo sommaParziale con 0 cosi da avere un contatore
		// int sommaParziale = 0;
		
		// itero sul mio arr creato ma non assegnato
		// for(int i : arr) {
			
			// sommo al mio contatore il numero di cicli fatti su array "arr"
			// sommaParziale += i;
		// }
		// stampo sommaParziale
		// log.info("somma parziale: " + sommaParziale);
		
	// }
	
		// 12) modifico il metodo run ora che hoaggiunto altre 2 proprietà	
			@Override
	public void run() {

		// inizializzo sommaParziale con 0 cosi da avere un contatore
		int sommaParziale = 0;
		
		// itero sul mio arr ma questa volta gli do come valore iniziale il mio indiceIniziale; se minore di indiceFinale incrementa.
		for(int i = indiceIniziale ; i < indiceFinale ; i++) {
			
			
			sommaParziale += arr[i];
		}
		
		// 19) dentro lo spazio di memoria dove ho creato la Lista mi salvo il parziale. FINE!!!!
		this.listaParziali.add(sommaParziale);
		// stampo sia l'ince inizle che quello finale più la somma parziale di 1000 interi con valori di massimo 25
		log.info("somma parziale: ("+ indiceIniziale +" - "+ indiceFinale +" ) " + sommaParziale);
		
	}
			// 13) finito possiamo andare nel main e avere la possibilita di istaziare un oggetto di tipo MioThread
			// che ora pero ha anche le proprietà indiceFinale e indiceIniziale da poter impostare. 
			// andiamo quindi a sistemare il costruttore nel main al quale mancano tali proprietà

}
 