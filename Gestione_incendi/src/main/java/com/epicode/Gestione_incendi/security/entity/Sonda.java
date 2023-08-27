package com.epicode.Gestione_incendi.security.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Sonda {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Double latitudine;
	
	@Column(nullable = false)
	private Double longitudine;
	
	@Column(nullable = false)
	private Integer smokeLevel;
	

    public void detectSmoke(int smokeLevel) {
        this.smokeLevel = smokeLevel;
        if (smokeLevel > 5) {
            System.out.println("allarme incendio!!!");
        }
    }


}
