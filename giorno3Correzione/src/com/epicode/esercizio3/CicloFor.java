package com.epicode.esercizio3;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INSERISCI UN NUMERO");
		int numero = sc.nextInt();
		
		for(int i = numero ; i>=0 ; i--) {
			System.out.println(i);
		}
	}
	
	

}
