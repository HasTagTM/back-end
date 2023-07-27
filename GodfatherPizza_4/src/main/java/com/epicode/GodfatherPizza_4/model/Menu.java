package com.epicode.GodfatherPizza_4.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {

	List<Drink> menuDrink = new ArrayList<Drink>();
	List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	
}
