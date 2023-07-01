package com.epicode.progettoSettimanale;

import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci un titolo");
            String titolo = sc.nextLine();

            System.out.println("Seleziona il tipo di elemento multimediale: ");
            System.out.println("1: registrazione Audio");
            System.out.println("2: registrazione Video");
            System.out.println("3: crea Immagine");

            int tipoElemento;
            while (true) {
                if (sc.hasNextInt()) {
                    tipoElemento = sc.nextInt();
                    sc.nextLine(); // Consuma il carattere di fine linea
                    break;
                } else {
                    System.out.println("ERRORE!! Input non valido. Inserisci un numero:");
                    sc.nextLine(); // Consuma l'input non valido
                }
            }

            switch (tipoElemento) {

                case 1:
                    System.out.println("Inserisci la durata dell'audio");
                    int durata = sc.nextInt();
                    System.out.println("Inserisci il volume dell'audio");
                    int volume = sc.nextInt();
                    sc.nextLine(); // Consuma il carattere di fine linea
                    elementi[i] = new Audio(titolo, durata, volume);
                    break;

                case 2:
                    System.out.println("Inserisci la durata del video");
                    durata = sc.nextInt();
                    System.out.println("Inserisci il volume del video");
                    volume = sc.nextInt();
                    System.out.println("Inserisci la luminosità del video");
                    int luminosita = sc.nextInt();
                    sc.nextLine(); // Consuma il carattere di fine linea
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                    break;

                case 3:
                    System.out.println("Inserisci la luminosità dell'immagine");
                    luminosita = sc.nextInt();
                    sc.nextLine(); // Consuma il carattere di fine linea
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;

                default:
                    System.out.println("Tipo di elemento non valido. Elemento non creato con successo");
                    i--; // Ripeto la creazione dell'elemento corrente
                    continue; // Ripeti il ciclo senza richiedere il titolo
            }
        }

        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Inserisci un numero da 1 a 5 (digita 0 per uscire)");
            scelta = sc.nextInt();
            sc.nextLine(); // Consuma il carattere di fine linea
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Video) {
                    ((Video) elemento).play();
                } else if (elemento instanceof Audio) {
                    ((Audio) elemento).play();
                }

            }

        }
        sc.close();
    }

}
