package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.epicode.enumerated.TipoEvento;

import javax.persistence.GenerationType;

@Entity
@Table(name = "eventi")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titoli" , nullable = false)
	private String titolo;
	
	@Column(name = "dataevento", nullable = false)
	private LocalDate dataEvento;
	
	@Column(name = "descr", nullable = false)
	private String decrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipologia", nullable = false)
	private TipoEvento tipoEvento;
	
	@Column(name = "maxpartecipanti", nullable = false)
	private Integer numeroMassimoPartecipanti;

	public Evento(String titolo, LocalDate dataEvento, String decrizione, TipoEvento tipoEvento,
			Integer numeroMassimoPartecipanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.decrizione = decrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Evento() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDecrizione() {
		return decrizione;
	}

	public void setDecrizione(String decrizione) {
		this.decrizione = decrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", decrizione=" + decrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}

}