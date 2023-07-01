package com.epicode.progettoSettimanale;

public class Immagine extends ElementoMultimediale implements IRegolaLuminosità{
	
	private int luminosita;
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;

	}

	@Override
	public void aumentaLuminosita() {
		if(luminosita > 0) {
		luminosita++;
		}
	}

	@Override
	public void diminuisciLuminosita() {
		if(luminosita < 100) {
		luminosita--;
		}
	}
	
	public void show() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(titolo);
		for(int i = 0 ; i < luminosita ; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
	}
}
