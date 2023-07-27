package com.epicode.GodfathersPizza1.classes;

import com.epicode.GodfathersPizza1.interfaces.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public abstract class Drink implements FoodItem {
	
	private String name;
	private Double price;
	private Double calories;

	public String getMenuLine() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}

	
	
}
