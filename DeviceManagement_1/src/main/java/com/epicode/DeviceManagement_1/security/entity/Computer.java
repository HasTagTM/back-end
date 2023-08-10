package com.epicode.DeviceManagement_1.security.entity;

import java.util.Set;

import com.epicode.DeviceManagement_1.enumerated.StatoDispositivo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "computer")
public class Computer extends Dispositivo{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	
	public Computer(StatoDispositivo stato, Dipendente dipendente, String name) {
		super(stato, dipendente);
		this.name = name;
	}
}