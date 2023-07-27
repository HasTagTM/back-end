package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.Entity;

@Entity
public class DrinkLemonade extends Drink{

	public DrinkLemonade() {
		super("Lemonade (0.33l)", 1.29, 128.0);

	}

}
