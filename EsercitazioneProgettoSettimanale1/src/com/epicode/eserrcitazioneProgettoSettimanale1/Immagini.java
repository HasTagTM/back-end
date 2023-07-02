package com.epicode.eserrcitazioneProgettoSettimanale1;

public class Immagini extends ElementoMultimediale implements Iilluminazione{
	public int luminosita;

	protected Immagini(String titolo, int luminosita) {
		super();
		this.luminosita = luminosita;
	}

	@Override
	public int aumentaLuminosita() {
		if(luminosita <= 0) {
			luminosita++;
		}else {
			System.out.println("impossibile alzare il volume");
		}
		return luminosita;
	}

	@Override
	public int diminuisciLuminosita() {
		if(luminosita <= 0) {
			luminosita--;
		}else {
			System.out.println("impossibile abbassare il volume");
		}
		return luminosita;
	}
	

	public void show() {
		StringBuilder sb = new StringBuilder();
		sb.append(titolo);
		for(int i = 0 ; i < luminosita ;  i++) {
			System.out.println("*");
		}
		System.out.println(sb.toString());
	}

	
	
}
