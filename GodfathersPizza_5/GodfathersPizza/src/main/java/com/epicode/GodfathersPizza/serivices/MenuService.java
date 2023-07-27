package com.epicode.GodfathersPizza.serivices;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.GodfathersPizza.classes.Menu;
import com.epicode.GodfathersPizza.repository.IMenuDAOrepository;

@Service
public class MenuService {
	
	@Autowired @Qualifier("menupizzeria") private ObjectProvider<Menu> menuProvider;

	private final IMenuDAOrepository ordineDAO;

    @Autowired
    public MenuService(@Qualifier("menuDAOrepositoryImpl") IMenuDAOrepository ordineDAO) {
        this.ordineDAO = ordineDAO;
    }
	
	public void stampaMenu() {
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		menuProvider.getObject().getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		menuProvider.getObject().getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println();
		
		System.out.println("***** FINE *****");
		
	}

}
