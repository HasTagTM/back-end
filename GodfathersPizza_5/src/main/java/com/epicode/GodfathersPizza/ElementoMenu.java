package com.epicode.GodfathersPizza;

import java.util.List;

public class ElementoMenu {

	 private String nome;
	 private double prezzo;
	 private String descrizione;
	 private List<String> variazioni;
	 private String note;
	public ElementoMenu(String nome, double prezzo, String descrizione, List<String> variazioni, String note) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.variazioni = variazioni;
		this.note = note;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public List<String> getVariazioni() {
		return variazioni;
	}
	public void setVariazioni(List<String> variazioni) {
		this.variazioni = variazioni;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
