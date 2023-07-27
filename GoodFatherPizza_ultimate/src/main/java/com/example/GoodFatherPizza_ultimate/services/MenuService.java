package com.example.GoodFatherPizza_ultimate.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.GoodFatherPizza_ultimate.models.IElementiConsumabili;
import com.example.GoodFatherPizza_ultimate.models.Menu;
import com.example.GoodFatherPizza_ultimate.repository.IMenuRepository;

@Service
public class MenuService {

	@Autowired IMenuRepository menuRepo;
	@Autowired @Qualifier("menu_pizzeria") private ObjectProvider<Menu>  menuProvider;
	
	public void stampaMenu() {
		System.out.println("***** MENU *****");
		System.out.println("***** Le Nostre Pizze *****");
		System.out.println();
		
		System.out.println("Drink");
		menuProvider.getObject().getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		System.out.println("Pizzas");
		menuProvider.getObject().getMenuPizza().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println("**** FINE ****");
	}
	
	public void creaElementiConsumabili() {
		menuProvider.getObject().getMenuPizza().forEach(p -> {
			menuRepo.save(p);
		});
		menuProvider.getObject().getMenuDrink().forEach(d -> {
			menuRepo.save(d);
		});
	}
	public IElementiConsumabili ricercaElementiConsumabiliPerId(Long id) {
		
		return menuRepo.findById(id).get();
		
	}
	public void ricercaTotaleElementiConsumabili() {
		
		menuRepo.findAll().forEach(o -> System.out.println(o));
		
	}
	public void modificaElementiConsumabile(IElementiConsumabili elemCons) {
		
		menuRepo.save(elemCons);
		
	}
	public void eliminaElementiConsumabili(IElementiConsumabili elemCons) {
		menuRepo.delete(elemCons);
	}
	
}
