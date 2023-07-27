package com.epicode.GodfatherPizza.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GodfatherPizza.interfaces.FoodItem;
import com.epicode.GodfatherPizza.model.Drink;
import com.epicode.GodfatherPizza.model.Lemonade;
import com.epicode.GodfatherPizza.model.Menu;
import com.epicode.GodfatherPizza.model.Ordine;
import com.epicode.GodfatherPizza.model.PizzaBase;
import com.epicode.GodfatherPizza.model.PizzaHawaiiana;
import com.epicode.GodfatherPizza.model.PizzaMargherita;
import com.epicode.GodfatherPizza.model.PizzaSalami;
import com.epicode.GodfatherPizza.model.Water;
import com.epicode.GodfatherPizza.model.Wine;

@Service
public class MenuService {
	
	@Autowired @Qualifier("menupizzeria") private ObjectProvider<Menu> menuProvider;
	
	

	@Autowired @Qualifier("margherita") private ObjectProvider<PizzaMargherita> adminUserProvider;
	@Autowired @Qualifier("hawaiiana") private ObjectProvider<PizzaHawaiiana> margheritaProvider;
	@Autowired @Qualifier("salami") private ObjectProvider<PizzaSalami> salamiProvider;
	@Autowired @Qualifier("lemonade") private ObjectProvider<Lemonade> lemonadeProvider;
	@Autowired @Qualifier("water") private ObjectProvider<Water> waterProvider;
	@Autowired @Qualifier("wine") private ObjectProvider<Wine> wineProvider;
	@Autowired @Qualifier("order") private ObjectProvider<Wine> ordineProvider;
	
	
//	public void addMeunuItem(FoodItem item) {
//		List<Drink> menu = ordineProvider.getObject().getMenuLine();
//		if(!ordinato.containsKey(item)) {
//			ordinato.put(item, 1);
//		} else {
//			ordinato.put(item, ordinato.get(item)+1);
//		}
//		System.out.println("Prodotto aggiunto al tuo ordine!!");
//	}
//	
//	public void removeMeunuItem(FoodItem item) {
//		if(ordinato.containsKey(item)) {
//			if(ordinato.get(item) == 1) {
//				ordinato.remove(item);
//			} else {
//				ordinato.put(item, ordinato.get(item)-1);
//			}
//		} 
//		System.out.println("Prodotto rimosso dal tuo ordine!!");
//	}
//	
//	public void getTotale() {
//		Double totale = 0.0;
//		for (FoodItem item : menu.ordinato.keySet()) {
//			totale += item.getPrice() * menu.ordinato.get(item);
//		}
//		
//		totale += (menu.costoCoperto * menu.numeroCoperti) ;
//		
//		System.out.println("Il totale del tuo ordine è " + totale);
//	}
//	
//	public void removeMeunuItem(FoodItem item) {
//		if(ordinato.containsKey(item)) {
//			if(ordinato.get(item) == 1) {
//				ordinato.remove(item);
//			} else {
//				ordinato.put(item, ordinato.get(item)-1);
//			}
//		} 
//		System.out.println("Prodotto rimosso dal tuo ordine!!");
//	}
//	
//	public void getTotale() {
//		Double totale = 0.0;
//		for (FoodItem item : ordinato.keySet()) {
//			totale += item.getPrice() * ordinato.get(item);
//		}
//		
//		totale += (costoCoperto * numeroCoperti) ;
//		
//		System.out.println("Il totale del tuo ordine è " + totale);
//	}
	
	public void stampaMenu() {
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		((Menu) menuProvider).getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		((Menu) menuProvider).getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println();
		
		System.out.println("***** FINE *****");
		
	}


}
