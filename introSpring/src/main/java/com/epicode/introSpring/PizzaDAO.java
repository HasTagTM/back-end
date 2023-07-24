package com.epicode.introSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaDAO {
	
	@GetMapping("/menu")
	public String showMenu(Model model) {
		List<Pizza> pizzas = createSamplePizzas();
		return "menu";
	}
	
	private List<Pizza> createSamplePizzas(){
		List<Pizza> pizzas = new ArrayList<>();
		pizzas.add(new Pizza("Margherita", "Pomodoro e mozzarella", 7.99));
		pizzas.add(new Pizza("Hawaiian Pizza", "Margherita con prosciutto e ananas", 9.99));
		return pizzas;
	}
	
}
