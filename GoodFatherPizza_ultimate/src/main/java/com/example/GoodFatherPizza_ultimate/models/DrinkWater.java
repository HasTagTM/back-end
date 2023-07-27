package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.Entity;

@Entity
public class DrinkWater extends Drink{

	public DrinkWater() {
		super("Water (0.5l)", 1.29, 0.0);
		
	}

}
