package com.esercizioGiorno2Settt2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1 {
	
	static Logger log = LoggerFactory.getLogger(Esercizio1.class);
	
	public static void main(String[] args) {


		Esercizio1 esercizio1 = new Esercizio1();
		esercizio1.insersciNumeroParole();
	}
	
	public static void insersciNumeroParole() {
		Scanner sc = new Scanner(System.in);
		log.info("inserisci il numero di parole che vuoi inserire:");
		int intero = sc.nextInt();
		sc.nextLine();
		
		Set<String> parole = new HashSet<>();   // HashSet è come una contenitore che può contenere solo oggetti 
												// diversi tra loro, senza duplicati. in questo caso "parole" 
												// diventa un contenitore di tipo HashSet
		
		log.info("inserisci le parole desiderate:");
		for(int i = 0 ; i < intero ; i++) {
			String parola = sc.nextLine();
			parole.add(parola);
		}
		
		log.info("Parole duplicate:");
		printDuplicateWords(parole);
		
		log.info("parole create:" + parole);
		log.info("il numero di parole create e pari a : " + parole.size());
		
	}
	private static void printDuplicateWords(Set<String> parole) {
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleUniche = new HashSet<>();

        for (String parola : parole) {
            if (!paroleUniche.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        for (String parola : paroleDuplicate) {
            log.info(parola);
        }
    }
	
	
}
