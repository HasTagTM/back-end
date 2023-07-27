package com.epicode.GodfathersPizza.ordini;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.epicode.GodfathersPizza.ordini.enumerated.StatoTavolo;

@Entity
public class Tavolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroCopertiMax;
	private StatoTavolo stato;
	@OneToOne(mappedBy = "tavolo")
	private Ordine ordine;
	public Tavolo(Integer numeroCopertiMax, StatoTavolo stato, Ordine ordine) {
		super();
		this.numeroCopertiMax = numeroCopertiMax;
		this.stato = stato;
		this.ordine = ordine;
	}
	public Tavolo() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroCopertiMax() {
		return numeroCopertiMax;
	}
	public void setNumeroCopertiMax(Integer numeroCopertiMax) {
		this.numeroCopertiMax = numeroCopertiMax;
	}
	public StatoTavolo getStato() {
		return stato;
	}
	public void setStato(StatoTavolo stato) {
		this.stato = stato;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", numeroCopertiMax=" + numeroCopertiMax + ", stato=" + stato + ", ordine=" + ordine
				+ "]";
	}
	
}
