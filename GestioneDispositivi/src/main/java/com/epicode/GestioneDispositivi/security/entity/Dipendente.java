package com.epicode.GestioneDispositivi.security.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Dipendente extends{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Dispositivo dispositivo;
	
	public Dipendente(User user, Dispositivo dispositivo) {
		super();
		this.dispositivo = dispositivo;
	}
	
}
