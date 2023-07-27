package com.epicode.GodfathersPizza1.classes;

import com.epicode.GodfathersPizza1.interfaces.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class PizzaBase implements FoodItem{

	private String name;
	private double price;
	private double calories;
	
	public String getMenuLine() {
		return this.name + " - calorie: " + this.calories + " - prezzo: " + this.price;
	}
	


	
	
}
