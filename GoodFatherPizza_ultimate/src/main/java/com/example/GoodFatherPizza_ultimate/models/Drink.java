package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "bevande")
public abstract class Drink extends IElementiConsumabili{

	public Drink(String name, Double price, Double calories) {
		super(name, price, calories);

	}

}
