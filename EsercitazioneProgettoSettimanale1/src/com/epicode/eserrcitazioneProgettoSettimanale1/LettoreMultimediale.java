package com.epicode.eserrcitazioneProgettoSettimanale1;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ElementoMultimediale[] elementi = new ElementoMultimediale[5];
		
		for(int i = 0 ; i < elementi.length ; i++) {

			System.out.println("inserisci il titiolo");
			String titolo = sc.nextLine();
			System.out.println("seleziona il tipo di elemento Multimediale da creare:");
			System.out.println("digita 1 per creare un immagine");
			System.out.println("digita 2 per creare un audio");
			System.out.println("digita 3 per creare un video");
			int scelta = sc.nextInt();
			while(scelta > 3 || scelta < 0) {
				System.out.println("ERRORE! INPUT NON VALIDO. inserire un numero valido.");
				
			}
			if(scelta == 1) {
				
				System.out.println("bene hai scelto di creare un immagine!");
				System.out.println("inserisci la luminosità");
				int luminosita = sc.nextInt();
				System.out.println("molto bene hai creato un immagine con successo!");
				elementi[i] = new Immagini(titolo, luminosita);
			}else if(scelta == 2) {
				System.out.println("bene hai scelto di creare una registrazione!");
				System.out.println("inserisci l'audio");
				int audio = sc.nextInt();
				System.out.println("inserisci la durata");
				int durata = sc.nextInt();
				elementi[i] = new Audio(titolo, audio , durata);
				
			}else if(scelta == 3) {
				System.out.println("bene hai scelto di creare un video!");
				System.out.println("inserisci l'audio");
				int audio = sc.nextInt();
				System.out.println("inserisci la durata");
				int durata = sc.nextInt();
				System.out.println("inserisci la luminosita");
				int luminosita = sc.nextInt();
				elementi[i] = new Video(titolo, audio, durata, luminosita);
			}
			ElementoMultimediale elemento = elementi[scelta -1];
			System.out.println("inserisci un numero da 1 a 5 per visualizzare i contenuti creati (premi 0 per terminare il programma)");
			if(elemento instanceof Immagini) {
				((Immagini) elemento).show();
			}else if(elemento instanceof Audio) {
				((Audio) elemento).play();
			}else if(elemento instanceof Video) {
				((Video) elemento).play();
			}else {
				
			}
			
		}
		
	}

}
