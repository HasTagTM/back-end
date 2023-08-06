package com.epicode.GestioneDispositivi.security.entity;

import java.time.LocalDate;
import java.util.Set;

import com.epicode.GestioneDispositivi.enuerated.StatoDispositivo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data
@Table(name = "tablet")
public class Tablet extends Dispositivo{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Tablet(StatoDispositivo stato, Dipendente dipendente, Set<AssegnaDispositivi> assegnazioni, String name) {
		super(stato, dipendente, assegnazioni);
		this.name = name;
	}
	
	
	

	
	
}
