package com.epicode.GestioneDispositivi.security.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "dipendente")
@Entity
public class AssegnaDispositivi {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Dipendente dipendente;
	
	private Dispositivo dispositivo;
	private LocalDate dataAssegnazione;
	private LocalDate dataScadenzaAssegnazione = null;
	
	public AssegnaDispositivi(Dipendente dipendente, Dispositivo dispositivo, LocalDate dataAssegnazione,
			LocalDate dataScadenzaAssegnazione) {
		super();
		this.dipendente = dipendente;
		this.dispositivo = dispositivo;
		this.dataAssegnazione = dataAssegnazione;
		this.dataScadenzaAssegnazione = dataScadenzaAssegnazione;
	}
		
	
}
