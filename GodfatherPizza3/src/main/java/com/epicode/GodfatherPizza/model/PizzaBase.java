package com.epicode.GodfatherPizza.model;


import com.epicode.GodfatherPizza.interfaces.FoodItem.FoodItems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public abstract class PizzaBase implements FoodItems{

	private String name;
	private Double price;
	private Double calories;

	public String getMenuLine() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}
		
}
