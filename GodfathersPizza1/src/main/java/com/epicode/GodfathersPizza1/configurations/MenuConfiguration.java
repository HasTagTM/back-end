package com.epicode.GodfathersPizza1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodfathersPizza1.classes.Lemonade;
import com.epicode.GodfathersPizza1.classes.Menu;
import com.epicode.GodfathersPizza1.classes.PizzaHawaiiana;
import com.epicode.GodfathersPizza1.classes.PizzaMargherita;
import com.epicode.GodfathersPizza1.classes.PizzaSalami;
import com.epicode.GodfathersPizza1.classes.Water;
import com.epicode.GodfathersPizza1.classes.Wine;



@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public Menu menu() {
		Menu m = new Menu();
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiiana());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWater());
		m.getMenuDrink().add(drinkWine());
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
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	
	
	@Bean
	@Scope("singleton")
	public Lemonade drinkLemonade() {
		return new Lemonade();
	}
	
	@Bean
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	}
	
	@Bean
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	}
}
