package com.epicode.GodfatherPizza.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import com.epicode.GodfatherPizza.enumerated.StatoOrdine;
import com.epicode.GodfatherPizza.interfaces.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ordine {
	
	private Integer numeroOrdine;
	private StatoOrdine statoOrdine;
	private Integer numeroCoperti;
	private LocalTime oraAcquisizioneOrdine;
	private Double costoCoperto;
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	
}