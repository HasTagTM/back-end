package com.epicode.esercizio1;

public class Esercizio1 extends Thread{

	public static void main(String[] args) {
		Thread2 threadue = new Thread2();
		Thread1 threaduno = new Thread1();
		threadue.start();
		threaduno.start();
		
	}
	

}
