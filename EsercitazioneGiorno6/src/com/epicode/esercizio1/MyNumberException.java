package com.epicode.esercizio1;

public class MyNumberException extends Exception{


	public MyNumberException(String message) {
		super(message);    //creo un costruttore che mi richiami la superClasse Exception
						//questo sara il mio gestore delle eccezioni personalizzato
	}

	
}
