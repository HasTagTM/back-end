package com.epicode.GodfatherPizza_4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodfatherPizza_4.model.DrinkLemonade;
import com.epicode.GodfatherPizza_4.model.DrinkWater;
import com.epicode.GodfatherPizza_4.model.DrinkWine;
import com.epicode.GodfatherPizza_4.model.Menu;
import com.epicode.GodfatherPizza_4.model.PizzaHawaiiana;
import com.epicode.GodfatherPizza_4.model.PizzaMargherita;
import com.epicode.GodfatherPizza_4.model.PizzaSalami;

@Configuration
public class MenuConfiguration {
	
	@Bean("menupizzeria")
	@Scope("singleton") 
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiian());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkWine());
		
		return m;
	}
	
	// bean Pizza
	
	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiiana pizzaHawaiian() {
		return new PizzaHawaiiana();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	// bean Drink
	
	@Bean
	@Scope("singleton")
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	@Scope("singleton")
	public DrinkWater drinkWater() {
		return new DrinkWater();
	}
	
	@Bean
	@Scope("singleton")
	public DrinkWine drinkWine() {
		return new DrinkWine();
	}
}

