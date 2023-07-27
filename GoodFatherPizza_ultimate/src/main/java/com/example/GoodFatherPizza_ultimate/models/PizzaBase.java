package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "pizze")
public abstract class PizzaBase extends IElementiConsumabili{

	public PizzaBase(String name, Double price, Double calories) {
		super(name, price, calories);

	}

	
	
}
