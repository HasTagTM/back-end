package com.epicode.esercizio4;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int numero = sc.nextInt();
		switch(numero) {
		case 1: System.out.println("uno");
		break;
		case 2: System.out.println("due");
		break;
		case 3: System.out.println("tre");
		break;
		default: System.out.println("numero non valido");
	
		}
		
	}

}
