package com.epicode.GodfatherPizza.model;

import com.epicode.GodfatherPizza.interfaces.FoodItem.FoodItems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter

public abstract class Drink implements FoodItems{

	private String name;
	private Double price;
	private Double calories;

	public String getMenuLine() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}


	
}
