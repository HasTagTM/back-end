package com.epicode.GodfathersPizza.classes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ordini")
public class Ordine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private Integer numeroOrdine;
	private StatoOrdine statoOrdine;
	@Column(nullable = false)
	private Integer numeroCoperti;
	@Column(nullable = false)
	private LocalTime oraAcquisizioneOrdine;
	private Double costoCoperto;
	private Tavolo tavolo;
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	
	public void addMeunuItem(FoodItem item) {
		if(!ordinato.containsKey(item)) {
			ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item)+1);
		}
		System.out.println("Prodotto aggiunto al tuo ordine!!");
	}
	
	public void removeMeunuItem(FoodItem item) {
		if(ordinato.containsKey(item)) {
			if(ordinato.get(item) == 1) {
				ordinato.remove(item);
			} else {
				ordinato.put(item, ordinato.get(item)-1);
			}
		} 
		System.out.println("Prodotto rimosso dal tuo ordine!!");
	}
	
	public void getTotale() {
		Double totale = 0.0;
		for (FoodItem item : ordinato.keySet()) {
			totale += item.getPrice() * ordinato.get(item);
		}
		
		totale += (costoCoperto * numeroCoperti) ;
		
		System.out.println("Il totale del tuo ordine è " + totale);
	}

}
