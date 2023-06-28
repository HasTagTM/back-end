package com.epicode.esercizio1;

import java.util.Scanner;

public class CostruttoIf {

	public static void main(String[] args) {
		
	
		String stringa = "ciao";
		boolean isPari = IfClass.stringaPariDispari(stringa);
				System.out.println("la stringa è pari? " + isPari);
		String stringa2 = "Hassane";
		boolean isDispari = IfClass.stringaPariDispari(stringa2);
				System.out.println("la stringa è dispari? " + isPari);
				
		int anno = 2023;
		boolean eBisestile = IfClass.annoBisestile(anno);
		System.out.println("l'anno " + anno + " è bisestile? " + eBisestile);
		
		int anno1 = 2020;
		boolean eBisestile1 = IfClass.annoBisestile(anno1);
		System.out.println("l'anno " + anno1 + " è bisestile? " + eBisestile1);
	}

}
