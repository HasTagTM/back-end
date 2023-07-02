package com.epicode.eserrcitazioneProgettoSettimanale1;

public class Video extends ElementoMultimediale implements Iilluminazione , IVolume {
	private int luminosita;
	private int audio;
	private int durata;
	protected Video(String titolo, int luminosita, int audio , int durata) {
		super();
		this.luminosita = luminosita;
		this.audio = audio;
		this.durata = durata;
	}
	
	
	@Override
	public int abbassaVolume() {
		if(audio <= 0) {
			audio--;
		}else {
			System.out.println("impossibile abbassare il volume");
		}
		return audio;
	}
	
	@Override
	public int alzaVolume() {
		if(audio <= 0) {
			audio++;
		}else {
			System.out.println("impossibile alzare il volume");
		}
		return audio;
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
	
	public void play() {
		StringBuilder sb = new StringBuilder();
		sb.append(durata);
		for(int i = 0 ; i < durata ; i++) {
			System.out.println("!");
		}
		for(int j = 0 ; j < luminosita ; j++) {
			System.out.println("*");
		}
		System.out.println(sb.toString());
	}
	
}





















