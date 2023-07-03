package com.epicode.sett2.giorno1;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomArrayMainProject {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(RandomArrayMainProject.class);
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			try {
				System.out.print("inserisci la posizione dell'array (0-4):");
				int posizione = sc.nextInt();
				if(posizione < 0 || posizione >= array.length) {
					throw new IndexOutOfBoundsException("posizione non valida");
				}if (posizione == 0) {
					break;
				}
				System.out.print("inserisci il valore da inserire:");
				int valore = sc.nextInt();
				updateArray(array, posizione, valore);

				}catch(Exception e) {
					log.error(e.getMessage());
				}
		}

	}
	
	private static int generateRandom() {
		return (int) (Math.random() * 10) + 1;
	}

	private static void updateArray(int[] array, int posizione, int valore) {
		// TODO Auto-generated method stub
		
	}

}
