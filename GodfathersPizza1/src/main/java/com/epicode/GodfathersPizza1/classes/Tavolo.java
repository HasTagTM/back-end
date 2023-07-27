package com.epicode.GodfathersPizza1.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tavolo {

	private Integer numero;
	private Integer numeroMaxCoperti;
	private Boolean occupato = false;
	
	
	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}
	
}
