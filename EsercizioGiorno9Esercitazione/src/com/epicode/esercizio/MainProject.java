package com.epicode.esercizio;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainProject {

	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	public static void main(String[] args) {
		
		List<Product> listaProdotti = new ArrayList<Product>();
		List<Product> listaOrdini = new ArrayList<Product>();
		
		Product product1 = new Product(1L, "Superman", "Books" , 60.0);
		Product product2 = new Product(2L, "Spiderman", "Books" , 30.0);
		Product product3 = new Product(3L, "Super Mario", "Book" , 25.0);
		Product product4 = new Product(4L, "Dragonball", "Books" , 180.0);
		Product product5 = new Product(5L, "KenShiro", "Book" , 120.0);
		
		listaProdotti.add(product1);
		listaProdotti.add(product2);
		listaProdotti.add(product3);
		listaProdotti.add(product4);
		listaProdotti.add(product5);

		
	
		//listaProdotti.forEach(p -> System.out.println(p));
		List<Product> listaBooks100 = listaProdotti100(listaProdotti);
		listaBooks100.forEach(p -> System.out.println(p));

	}
	
	//Esercizio #1
	//Ottenere una lista di prodotti che appartengono alla categoria «Books» ed hanno un prezzo > 100
	
	public static List<Product> listaProdotti100(List<Product> lista){
		return 
				lista.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());
	}

	//Esercizio #2
	//Ottenere una lista di ordini con prodotti che appartengono alla categoria <Baby»>

	//public static List<Order> listaOrdini(){
		
	//}
	
	//Esercizio #4
	//Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l'01-Feb-2021 e l'01-Apr-2021

	//Esercizio #3
	//Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
	
}
