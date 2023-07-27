package com.example.GoodFatherPizza_ultimate.models;

import jakarta.persistence.Entity;

@Entity
public class PizzaHawaiiana extends PizzaBase{


	public PizzaHawaiiana() {
		super("Pizza Hawaiian (tomato, cheese, ham, pinapple)", 6.49, 1024.0);

	}


}
