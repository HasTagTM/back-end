package com.epicode.esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainProject {

	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	public static void main(String[] args) {
		
		List<Product> listaProdotti = new ArrayList<Product>();
		List<Product> listaOrdini = new ArrayList<Product>();
		
		Product product1 = new Product(1L, "Superman", "Books" , 60.0);
		Product product2 = new Product(2L, "Spiderman", "Baby" , 30.0);
		Product product3 = new Product(3L, "Super Mario", "Baby" , 25.0);
		Product product4 = new Product(4L, "Dragonball", "Books" , 180.0);
		Product product5 = new Product(5L, "KenShiro", "Book" , 120.0);
		
		listaProdotti.add(product1);
		listaProdotti.add(product2);
		listaProdotti.add(product3);
		listaProdotti.add(product4);
		listaProdotti.add(product5);

		//private Long id;
		//private String status;
		//private LocalDate orderDate;
		//private LocalDate delyveryDate;
		//private List<Product> products;
		//private Customers customers;
		
		Customers customer1 = new Customers(1L,"Hassan Sahraoui",2);
		Customers customer2 = new Customers(2L, "Mario Rossi" , 3);
		Customers customer3 = new Customers(3L, "Luigi Bruno" , 4);
		Customers customer4 = new Customers(4L, "Bruno Luigi" , 5);
		
		Order ordine1 = new Order(1L, "Confermato", LocalDate.of(2021, 1, 25), LocalDate.of(2021, 1, 30) , Arrays.asList(product1, product2, product3, product4) , customer4);
		Order ordine2 = new Order(2L, "In Attesa", LocalDate.of(2021, 5, 15), LocalDate.of(2021, 5, 25) , Arrays.asList(product2, product3) , customer3);
		Order ordine3 = new Order(3L, "Annullato", LocalDate.of(2021, 9, 2), LocalDate.of(2021, 9, 10) , Arrays.asList(product1,product4) , customer2);
		Order ordine4 = new Order(4L, "Confermato", LocalDate.of(2021, 6, 8), LocalDate.of(2021, 6, 18) , Arrays.asList(product1, product2, product3) , customer1);
		
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

	public static List<Order> listaOrdini(List<Order> listaBaby){
		return listaBaby.stream().filter(p -> p.getProducts().stream().filter(p -> p.getCategory()).equalsIgnoreCase("baby").collect(Collectors.toList());
	}
	
	//Esercizio #4
	//Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l'01-Feb-2021 e l'01-Apr-2021

	//Esercizio #3
	//Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
	
}
