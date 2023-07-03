package com.epicode.esercizio1;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainArrayCinqueRandom {
	static Logger log = LoggerFactory.getLogger(MainArrayCinqueRandom.class);
	public static void main(String[] args) {
		

		int[] numArray = generaArray();  //inizializzo un array metodo generaArray()
		stampaArray(numArray);           //incoco il metodo stampaArray che accetta un parametro che sarà l'array in questione numArray[]
		cambiaValoreArray(numArray);   
		log.info("fine");
	}
	
	public static int[] generaArray() {
		int[] array = new int[5];   //inizializzo un array da 5 elementi
		Random rand = new Random();  //attivo il random di java
		for(int i = 0 ; i < array.length ; i++) {  //faccio un ciclo per iterare su tutti gli elementi dell'array [5]
			array[i] = rand.nextInt(11);   //popolo l 'array di numeri cauali da 0 a 10
		}
		return array;  //ritorno l'array popolato da numeri randomici da 1 a 10
	}
	
	public static void stampaArray(int[] arr) {  //metodo che accetta un array int in entrata
		for (int i = 0; i < arr.length; i++) {   //lo itero con un ciclo per stamparne i valori
			log.info("Posizione: " + i + " Valore: " + arr[i]);    //scateno il log.info() per generare il mio messaggio con tutti i dettagli
		}
	}
	
	public static void cambiaValoreArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("inserisci un nuovo valore da 1 a 10 oppure 0 per uscire");
			try {
			int val = Integer.parseInt(sc.nextLine());
			if(val == 0) {
				return;  // blocco tutto se l'utente vuole uscire
			}else if(val > 10) {
				//try {
					throw new MyNumberException("devi inserire un numero compreso tra 1 e 10");  //devo anche poi definire un catch
				//}catch(MyNumberException e) {
					//log.error(e.getMessage());	   //stampo il messaggio di errore se cade nel catch			}
			}
			System.out.print("inserisci una posizione da 0 a 4");
			int posiz = Integer.parseInt(sc.nextLine());
			//try {
				//arr[posiz] = val;   //inserisco il nuovo valore nella posizione scelto dall'utente
				  //stampo l'array nuovo
			}catch(ArrayIndexOutOfBoundsException e) {
				log.error(e.getMessage() + "valore non valido! inserire valore valido");
			}catch (NumberFormatException e) {
				log.error(e.getMessage());
			}catch(MyNumberException e) {
				log.error(e.getMessage());
			
			}catch (Exception e) {
				log.error(e.getMessage());
			}  
		
			stampaArray(arr); 
		}
	}
}
