package esercizio2G3;

import java.util.Scanner;

public class Switch_MainProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un numero intero: ");
		int numero = sc.nextInt();
				
				switch(numero) {
				case 0:
				System.out.println("zero");
				break;
				case 1:
					System.out.println("zero");
					break;
				case 2:
					System.out.println("uno");
					break;
				case 3:
					System.out.println("due");
					break;
					
					default:
					System.out.println("valore inserito non valido");
				}
		

	}

}
