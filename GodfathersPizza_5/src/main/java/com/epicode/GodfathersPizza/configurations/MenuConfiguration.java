package com.epicode.GodfathersPizza.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodfathersPizza.classes.LemonadeDrink;
import com.epicode.GodfathersPizza.classes.Menu;
import com.epicode.GodfathersPizza.classes.PizzaHawaiiana;
import com.epicode.GodfathersPizza.classes.PizzaMargherita;
import com.epicode.GodfathersPizza.classes.PizzaSalamiPizza;
import com.epicode.GodfathersPizza.classes.WaterDrink;
import com.epicode.GodfathersPizza.classes.WineDrink;

@Configuration
public class MenuConfiguration {
	
	@Bean
	@Scope("singleton")
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiiana());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkWine());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkLemonade());
		return m;
	}

	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiiana pizzaHawaiiana() {
		return new PizzaHawaiiana();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaSalamiPizza pizzaSalami() {
		return new PizzaSalamiPizza();
	}
	
	@Bean
	@Scope("singleton")
	public LemonadeDrink drinkLemonade() {
		return new LemonadeDrink();
	}
	
	@Bean
	@Scope("singleton")
	public WaterDrink drinkWater() {
		return new WaterDrink();
	}
	
	@Bean
	@Scope("singleton")
	public WineDrink drinkWine() {
		return new WineDrink();
	}
	
}
