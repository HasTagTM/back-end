package ecommerce;

public class Articolo {
	private int codiceArticolo;
	private String descrizioneArticolo;
	private double prezzo;
	private int pezziDisponibili;
	
	public Articolo(int codiceArticolo, String descrizioneArticolo , double prezzo , int pezziDisponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.pezziDisponibili = pezziDisponibili;
	}
}

