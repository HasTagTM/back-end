package com.example.GoodFatherPizza_ultimate.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Menu {



	
	private List<Drink> menuDrink = new ArrayList<Drink>();
	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	
}