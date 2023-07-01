package com.epicode.progettoSettimanale;

public class Audio extends ElementoMultimediale implements IRegolaVolume{

	private int durata;
	private int volume;
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;

	}

	@Override
	public void abbassaVolume() {
		if(volume <= 0) {
		volume++;
		}
	}

	@Override
	public void alzaVolume() {
		if(volume >= 100)
		volume--;
		
	}
	
	public void play() {
		StringBuilder sb = new StringBuilder();
		sb.append(titolo);
		for(int i = 0 ; i < volume ; i++) {
			sb.append("!");
		}
		System.out.println(sb.toString());
	}

}
