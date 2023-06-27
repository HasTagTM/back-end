package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
	private List<Articolo> articoli;
	
	public Carrello() {
		this.articoli = new ArrayList<>()
	}
	
	public void aggiungiArticolo(Articolo articolo) {
		articoli.add(articolo);
	}
}
