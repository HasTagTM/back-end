package esercizio3G3;

import java.util.Scanner;

public class WhileProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una stringa (':q' per uscire):");
		String stringa = sc.nextLine();
		
		while (!stringa.equals(":q")) {
			for (int i = 0; i < stringa.length(); i++) {
				System.out.print(stringa.charAt(i) + ",");
			}
			System.out.println();
			
			System.out.println("Inserisci una stringa (':q' per uscire):");
			stringa = sc.nextLine();
		}

		System.out.println("Programma terminato.");
	}

}

