package com.esercizio2Giorno2Sett2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2 {

	static Logger log = LoggerFactory.getLogger(Esercizio2.class);
	
	public static void main(String[] args) {
		
		Esercizio2 esercizio2 = new Esercizio2();
		Scanner sc = new Scanner(System.in);
		log.info("inserisci il numero di numeri casuali che vuoi visualizzare:");
		int lunghezzaLista = sc.nextInt();
		List<Integer> numeriCasuali = generaNumeriRandom(10);
        log.info("Numeri casuali generati: {}", numeriCasuali);
        log.info("questa è la tua lista inversa");
        listaInversa(numeriCasuali);
        valoriPariDispari(numeriCasuali , true);

	}

	

	public static List<Integer> generaNumeriRandom(int N){
		List<Integer> numeriCasuali = new ArrayList<>();
		for(int i = 0 ; i < N ; i++) {
		int numero = (int) (Math.random()*101);
		numeriCasuali.add(numero);
		}
		return numeriCasuali;
	}
	public static List<Integer> listaInversa(List<Integer> lista){
		List<Integer> numeriInversi = new ArrayList<>();
		Collections.reverse(numeriInversi);
		
		return numeriInversi;
	}
	
	public static void valoriPariDispari(List<Integer> lista , boolean pari){
		for(int i = 0 ; i < lista.size() ; i++) {
			if((i % 2 == 0 && pari) || (i % 2 !=0 && pari)) {
				log.info(lista.get(i).toString());
			}
		}
	}
	
	
}
  