package com.epicode.esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.esercizio3.MioThread;



public class MainProgectEsercizio2 {

	private static Logger log = LoggerFactory.getLogger(MainProgectEsercizio2.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// INIZIO: creo un array di interi e lo assegno al metodo creaArray cosi avra le capacita 
		// di CreaArray di 30 numeri genrati random con valori che hanno un limite di 25
		int[] arr = creaArray(30);
		
		// 15) creo una lista con integer che è un contenitore con all'interno un dato 
		// primitivo cosi da poterli utilizzare e la assegno ad un arrayList
		List<Integer> listaParziali = new ArrayList<Integer>();
		
		// 21) inizializzo il tottale a 0 per poter sommargli i vari thread
		int totale = 0;
		
		// 10) faccio un test sul funzionamento della somma dei numeri nell'ARRAY
		//for(int i =0; i < arr.length ; i++) {
		//	System.out.println(arr[i]);
		//}
		
		// 9) istazio un nuovo oggetto di tipo Thread dalla classe di JAVA Thread assegnandoli pero il MiOThread creato
		
		// 14) aggiungo le proprieta mancanti indiceIniziale e indiceFinale
		// 16) aggiungo listParziali ai thread creati cosi si inseriscono all'inteno della lista
		// ma non prima di averla aggiunta come proprietà al thread creato MioThread.
		Thread t1 = new Thread(new MioThread(arr , 0 , 10 , listaParziali));
		Thread t2 = new Thread(new MioThread(arr , 10 , 20 , listaParziali));
		Thread t3 = new Thread(new MioThread(arr , 20 , 30 , listaParziali));
		t1.start();
		t2.start();
		t3.start();
		
		// 20) utilizzo il join cosi parte uno alla volta
		t1.join();
		t2.join();
		t3.join();
		
		// 22) ora che ho una lista e il mio totale inizializzato a 0 posso iterare sugli Integer di listaParziali con valori
		for(Integer val : listaParziali) {
			
			// 23) sommo al mio contatore "totale" il valore all 'interno del parziale
			totale += val;
		}
		
		// 24) faccio la stampa del totale dei parziali
		log.info("totale: " + totale);
	}

	public static int[] creaArray(int size) {
		
		// 1) istazio il Random di java con random
		Random random = new Random();
		
		// 2) inizializzo un array di interi e lo assegno a un nuovo array di interi
		// che prenda il valore di size ovvero quanti numeri casuali voglio generare
		int[] arrNumeri = new int[size];
		
		// 3) faccio un ciclo for per iterare sul mio array di interi arrNumeri che si basa su size.
		for(int i = 0 ; i < arrNumeri.length ; i++) {
			
			// 4) assegno i numeri generati basati sul size a random cosi che siano randomici con limite di 25 come valori
			arrNumeri[i] = random.nextInt(25);
		}
		// 5) mi ritorno alla fine arrNumeri processato randomico con limite 25 come valori
		return arrNumeri;
	}

}
 