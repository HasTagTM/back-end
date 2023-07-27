package com.example.GoodFatherPizza_ultimate.configurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.GoodFatherPizza_ultimate.models.DrinkLemonade;
import com.example.GoodFatherPizza_ultimate.models.DrinkWater;
import com.example.GoodFatherPizza_ultimate.models.DrinkWine;
import com.example.GoodFatherPizza_ultimate.models.Menu;
import com.example.GoodFatherPizza_ultimate.models.PizzaHawaiiana;
import com.example.GoodFatherPizza_ultimate.models.PizzaMargherita;
import com.example.GoodFatherPizza_ultimate.models.PizzaSalami;

@Configuration
public class MenuConfiguration {

	
	@Bean("menu_pizzeria")
	@Scope("singleton")
	public Menu listaMenu(){
		Menu menu = new Menu();
		menu.getMenuDrink().add(drinkLemonade());
		menu.getMenuDrink().add(drinkWater());
		menu.getMenuDrink().add(drinkWine());
		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaSalami());
		menu.getMenuPizza().add(pizzaHawaiiana());
		return menu;
	}

	@Bean("pizza_margherita")
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean("pizza_hawaiiana")
	@Scope("singleton")
	public PizzaHawaiiana pizzaHawaiiana() {
		return new PizzaHawaiiana();
	}
	
	@Bean("creaPizza")
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean("drink_lemonade")
	@Scope("singleton")
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean("drink_acqua")
	@Scope("singleton")
	public DrinkWater drinkWater() {
		return new DrinkWater();
	}
	
	@Bean("drink_vino")
	@Scope("singleton")
	public DrinkWine drinkWine() {
		return new DrinkWine();
	}
	

}
