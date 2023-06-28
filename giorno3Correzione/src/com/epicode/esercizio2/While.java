package com.epicode.esercizio2;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("inserire stringa (':q' per uscire) :");
		String stringa = sc.nextLine();
		System.out.println(stringa);
		
		while(!stringa.equals(":q")) {

			for(int i = 0; i< stringa.length(); i++) {
			System.out.println(stringa.charAt(i) + ",");
		}
		System.out.println();
		System.out.println("inserire stringa (':q' per uscire) :");
		stringa = sc.nextLine();
		}
		System.out.println("programma terminato");
	}

}
