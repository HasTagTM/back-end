package com.epicode.GodfathersPizza.ordini;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.epicode.GodfathersPizza.ordini.enumerated.StatoOrdine;


public class Ordine {

	private Integer nOrdine;
	private StatoOrdine stOrdine;
	private Integer nCoperti;
	private LocalDateTime oraAcquisizione;
	@OneToOne
	@JoinColumn(name = "tavolo_id")
	private Tavolo tavolo;
	private double importoTotale;

	public Ordine(Integer nOrdine, StatoOrdine stOrdine, Integer nCoperti, LocalDateTime oraAcquisizione, Tavolo tavolo,
			double importoTotale) {
		super();
		this.nOrdine = nOrdine;
		this.stOrdine = stOrdine;
		this.nCoperti = nCoperti;
		this.oraAcquisizione = oraAcquisizione;
		this.tavolo = tavolo;
		this.importoTotale = importoTotale;
	}
	public Ordine() {
		super();
	}
	public Integer getnOrdine() {
		return nOrdine;
	}
	public void setnOrdine(Integer nOrdine) {
		this.nOrdine = nOrdine;
	}
	public StatoOrdine getStOrdine() {
		return stOrdine;
	}
	public void setStOrdine(StatoOrdine stOrdine) {
		this.stOrdine = stOrdine;
	}
	public Integer getnCoperti() {
		return nCoperti;
	}
	public void setnCoperti(Integer nCoperti) {
		this.nCoperti = nCoperti;
	}
	public LocalDateTime getOraAcquisizione() {
		return oraAcquisizione;
	}
	public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
		this.oraAcquisizione = oraAcquisizione;
	}
	public Tavolo getTavolo() {
		return tavolo;
	}
	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	public double getImportoTotale() {
		return importoTotale;
	}
	public void setImportoTotale(double importoTotale) {
		this.importoTotale = importoTotale;
	}
	
	
}
