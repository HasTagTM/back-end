package com.epicode.GodfathersPizza.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.epicode.GodfathersPizza.ordini.Ordine;

public class Menu {
	@Value("£{costo.coperto}") 
	private Long costoCoperto;

	private List<PizzaBase> menuPizza = new ArrayList<>();
	private List<Drink> menuDrink = new ArrayList<>();

	public List<PizzaBase> getMenuPizza() {
		return menuPizza;
	}

	public List<Drink> getMenuDrink() {
		return menuDrink;
	}

//	public double calcolaTotaleOrdine(Ordine ordine) {
//		double costoTotale = ordine.getnCoperti() * costoCoperto;
//		
//	} 
	
}
