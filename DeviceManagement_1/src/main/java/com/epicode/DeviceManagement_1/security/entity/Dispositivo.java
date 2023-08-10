package com.epicode.DeviceManagement_1.security.entity;


import com.epicode.DeviceManagement_1.enumerated.StatoDispositivo;

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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
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


	public Dispositivo(StatoDispositivo stato, Dipendente dipendente) {
		super();
		this.stato = stato;
		this.dipendente = dipendente;

	}
}