package esercizio2;

public class cartaSIM {
	String numeroTelefono;
	double creditoDisponibile;
	Chiamata[] listaChiamate;
	
	public cartaSIM(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.creditoDisponibile = 0;
		this.listaChiamate = new Chiamata[5];
	}
	public void ricarica(double euro) {
		this.creditoDisponibile += euro;
	}
	
	public void effettuaChiamta(String numeroDaChiamare) {
		if(creditoDisponibile <= 0) {
			System.out.println("il tuo credito è insufficiente");
		}else {
		for(int i = 0; i < listaChiamate.length ; i++ ) {
			if(listaChiamate[i] == null) {
				this.listaChiamate[i] = new Chiamata(2 , numeroDaChiamare);
				this.creditoDisponibile--;
				break;
			}
		}
		
		System.out.println("chiamata effettuata sul numero: " + numeroDaChiamare);
		}
	}
	public void stampaDatiSIM() {
		System.out.println("numero:" + this.numeroTelefono);
		System.out.println("credito:" + this.creditoDisponibile);
		System.out.println("lista ultime 5 chiamate:");
		for(int i = 0 ; i < listaChiamate.length ; i++) {
			if(listaChiamate[i] != null) {
				
			}
			System.out.println(listaChiamate[i].numeroChiamato + " durata " + " " + listaChiamate[i].durata);
		}
	}
	
}
