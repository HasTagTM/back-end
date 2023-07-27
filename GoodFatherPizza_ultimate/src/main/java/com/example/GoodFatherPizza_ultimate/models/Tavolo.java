package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tavolo {

	private Integer numero;
	private Integer numeroMassimoCoperti;
	private Boolean occupato = false;
	
}
