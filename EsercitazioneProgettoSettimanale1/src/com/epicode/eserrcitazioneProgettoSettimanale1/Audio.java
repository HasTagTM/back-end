package com.epicode.eserrcitazioneProgettoSettimanale1;

public class Audio extends ElementoMultimediale implements IVolume {
	public int audio;
	public int durata;

	protected Audio(String titolo, int audio , int durata) {
		super();
		this.audio = audio;
		this.durata = durata;
	}

	public Audio(int audio) {
		super();
		this.audio = audio;
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
	
	public void play() {
		StringBuilder sb = new StringBuilder();
		sb.append(titolo);
		for(int i = 0 ; i < durata ; i++) {
			System.out.println("!");
		}
		System.out.println(sb.toString());
	}
	
}
