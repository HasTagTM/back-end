package com.epicode.progettoSettimanale;

public class Video extends ElementoMultimediale implements IRegolaLuminosità, IRegolaVolume{

	private int durata;
	private int volume;
	private int luminosita;
	
	Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;

	}

	@Override
	public void aumentaLuminosita() {
		if(luminosita < 0) {
		luminosita++;
		}
	}

	@Override
	public void diminuisciLuminosita() {
		if(luminosita > 100) {
		luminosita--;
		}
	}

	@Override
	public void abbassaVolume() {
		if(volume < 0) {
		volume++;
		}
	}

	@Override
	public void alzaVolume() {
		if(volume > 100) {
		volume--;
		}
	}
	public void play() {
		StringBuilder sb = new StringBuilder();
		sb.append(titolo);
		for(int i = 0 ; i < volume; i++) {
			sb.append("!");
		}
		for(int j = 0 ; j < luminosita ; j++) {
			sb.append("*");
			
		}
		System.out.println(sb.toString());
	}

}
