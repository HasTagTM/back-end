package com.epicode.Gestione_incendi.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Personale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private User vigileDelFuco;
	
	public void handleAlarm(int sondaId, int smokeLevel) {
        System.out.println("Allarme rilevato nella sonda " + sondaId + " con livello di fumo " + smokeLevel);
        System.out.println("Chiamare i pompieri e evacuare l'area.");
    }
	
}
