package esercizioG3;

public class Esercizio_1 {

	public static void main(String[] args) {
		
		String stringa1 = "ciao";
		
		boolean isPari = MetodiES1.stringaPariDispari(stringa1);
				System.out.println(" la stringa \"" + stringa1 +  "\" ha una lunghezza pari?" + isPari );
		
				String stringa2 = "Hassane";
				
				boolean isDispari = MetodiES1.stringaPariDispari(stringa2);
						System.out.println(" la stringa \"" + stringa2 +  "\" ha una lunghezza pari?" + isDispari );
						
		int anno1 = 1944;
						
		boolean isBisestile1 = MetodiES1.annoBisestile(anno1);
		System.out.println("l'anno " + anno1 + " è bisestile? " + isBisestile1);
		
		int anno2 = 2023;
		
		boolean isBisestile2 = MetodiES1.annoBisestile(anno2);
		System.out.println("l'anno " + anno2 + " è bisestile? " + isBisestile2);
	}
	
	
	
	
	

}
