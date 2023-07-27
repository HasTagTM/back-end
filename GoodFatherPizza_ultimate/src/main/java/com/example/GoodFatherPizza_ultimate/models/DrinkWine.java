package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.Entity;

@Entity
public class DrinkWine extends Drink{

	public DrinkWine() {
		super("Wine (0.75l, 13%)", 7.49, 607.0);

	}

}
