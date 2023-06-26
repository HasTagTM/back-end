package it.epicode;
import java.util.Scanner;
public class es2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		soluzione2();
		
	}
	public static void soluzione2() {
		
		System.out.print("inserisci nome:");
		String nome = sc.nextLine();
		System.out.print("inserisci cognome:");
		String cognome = sc.nextLine();
		
		System.out.print("inserisci città:");
		String citta = sc.nextLine();
		
		System.out.println(nome+cognome+citta);
		System.out.println(citta+cognome+nome);
	}

}
