package com.epicode.GodfatherPizza.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.GodfatherPizza.enumerated.StatoOrdine;
import com.epicode.GodfatherPizza.model.Lemonade;
import com.epicode.GodfatherPizza.model.Menu;
import com.epicode.GodfatherPizza.model.Ordine;
import com.epicode.GodfatherPizza.model.PizzaHawaiiana;
import com.epicode.GodfatherPizza.model.PizzaMargherita;
import com.epicode.GodfatherPizza.model.PizzaSalami;
import com.epicode.GodfatherPizza.model.Water;
import com.epicode.GodfatherPizza.model.Wine;

@Configuration
@PropertySource("classpath:application.properties")
public class MenuConfiguration {

		@Value("${user.admin.name}") private String adminName;
		
		@Bean("menupizzeria")
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
	
	@Bean("margherita")
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean("hawaiiana")
	@Scope("singleton")
	public PizzaHawaiiana pizzaHawaiiana() {
		return new PizzaHawaiiana();
	}
	
	@Bean("salami")
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	// bean Drink
	
	@Bean("lemonade")
	@Scope("singleton")
	public Lemonade drinkLemonade() {
		return new Lemonade();
	}
	
	@Bean("water")
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	}
	
	@Bean("wine")
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	}
	
	
	@Bean("order")
	@Scope("prototype")
	public Ordine ordine(Integer numeroOrdine,StatoOrdine statoOrdine ,Integer numeroCoperti ) {
		
		Ordine o = new Ordine();
		return o;
	}

}
