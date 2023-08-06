package com.epicode.GestioneDispositivi.security.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.epicode.GestioneDispositivi.enuerated.StatoDispositivo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "dispositivo")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Dispositivo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatoDispositivo stato;
	
	@ManyToOne
	private Dipendente dipendente;

	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
    private Set<AssegnaDispositivi> assegnazioni = new HashSet<>();

	public Dispositivo(StatoDispositivo stato, Dipendente dipendente, Set<AssegnaDispositivi> assegnazioni) {
		super();
		this.stato = stato;
		this.dipendente = dipendente;
		this.assegnazioni = assegnazioni;
	}
	
	
	
	
	
}
