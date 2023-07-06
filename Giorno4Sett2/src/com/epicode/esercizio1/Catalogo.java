package com.epicode.esercizio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicBorders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Catalogo {

	private static Logger log = LoggerFactory.getLogger(Catalogo.class);
	
	public static void main(String[] args) {
		
		List<Product> products = creaProdotti();
		List<Product> products1 = creaProdotti1();
	
		// Esercizio #1
		// Ottenere una lista di prodotti che appartengono alla categoria «Books» ed hanno un prezzo > 100
		
		// Filtraggio dei prodotti:
		// Filtraggio dei prodotti della categoria "Books" con prezzo > 100. e facenti parte della categoria Books
		// Infine, raccogliamo i prodotti filtrati in una nuova lista utilizzando collect(Collectors.toList()).
		List<Product> prodottiCari = products.stream()
				.filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100)
				.collect(Collectors.toList());
		log.info("I prodotti più cari della categoria Books sono: " + prodottiCari);
		
		// Esercizio #2
		// Ottenere una lista di ordini con prodotti che appartengono alla categoria <Baby»>
		List<Order> ordini = creaOrdini();
		List<Order> ordiniBaby = ordini.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby")))
                .collect(Collectors.toList());
			
				log.info("gli ordini della categoria Baby sono: " + ordiniBaby);
		
		// Esercizio #3
		// Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
		List<Product> prodottiScontati = products1.stream().filter(p -> p.getCategory().equals("Boys")).map(
				p -> {
					double prezzoScontato = p.getPrice() * 0.9;
					p.setPrice(prezzoScontato);
					return p;
				}).collect(Collectors.toList());
		log.info("I prodotti scontati della categoria Boys sono: " + prodottiScontati);
		
		// Esercizio #4
		// Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l'01-Feb-2021 e l'01-Apr-2021
		List<Product> prodottiFiltrati = filtraggioProdotti(ordini);
		log.info("I prodotti ordinati da clienti di livello 2 tra l'01-Feb-2021 e l'01-Apr-2021 sono: " + prodottiFiltrati);

	}

	// Esercizio #1
	// Ottenere una lista di prodotti che appartengono alla categoria «Books» ed hanno un prezzo > 100
	
	private static List<Product> creaProdotti(){
		List<Product> products = List.of(
				new Product(1L, "Book1", "Books", 50.0),
				new Product(2L, "Book2", "Books", 120.0),
				new Product(3L, "Book3", "Books", 150.0),
				new Product(4L, "Book4", "Book", 30.0),
				new Product(5L, "Book5", "Book", 60.0)
		);
		return products;
	}
	
	
	// Esercizio #2
	// Ottenere una lista di ordini con prodotti che appartengono alla categoria <Baby»>
	
	private static List<Order> creaOrdini() {
	    List<Product> products1 = List.of(
	        new Product(1L, "Book1", "Books", 50.0),
	        new Product(2L, "Toy1", "Toys", 30.0)
	    );

	    List<Product> products2 = List.of(
	        new Product(3L, "Book2", "Books", 120.0),
	        new Product(4L, "Baby1", "Baby", 40.0)
	    );

	    List<Product> products3 = List.of(
	        new Product(5L, "Toy2", "Toys", 60.0),
	        new Product(6L, "Baby2", "Baby", 80.0)
	    );

	    Customers customer1 = createCustomers(1L, "John Doe", 2);
	    Customers customer2 = createCustomers(2L, "Jane Smith", 1);

	    Order order1 = new Order(1L, "Completed", LocalDate.of(2022, 1, 10), LocalDate.of(2022, 1, 15), new ArrayList<>(products1), customer1);
	    Order order2 = new Order(2L, "Completed", LocalDate.of(2022, 2, 5), LocalDate.of(2022, 2, 10), new ArrayList<>(products2), customer2);
	    Order order3 = new Order(3L, "In Progress", LocalDate.of(2022, 3, 20), null, new ArrayList<>(products3), customer1);

	    List<Order> orders = new ArrayList<>();
	    orders.add(order1);
	    orders.add(order2);
	    orders.add(order3);
	    return orders;
	}

	    
	    private static Customers createCustomers(Long id, String name, Integer tier) {
	        return new Customers(id, name, tier);
	    }
	    
	    
	    // Esercizio #3
	 	// Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
	    
	    private static List<Product> creaProdotti1() {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product(1L, "Toy1", "Boys", 20.0));
	        products.add(new Product(2L, "Toy2", "Girls", 30.0));
	        products.add(new Product(3L, "Toy3", "Boys", 25.0));
	        products.add(new Product(4L, "Toy4", "Girls", 40.0));
	        products.add(new Product(5L, "Toy5", "Boys", 35.0));
	        return products;
	    }
	    
	    
	    // Esercizio #4
	 	// Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l'01-Feb-2021 e l'01-Apr-2021
	    
	    private static List<Product> filtraggioProdotti(List<Order> orders) {
	        LocalDate startDate = LocalDate.of(2021, 2, 1);
	        LocalDate endDate = LocalDate.of(2021, 4, 1);

	        return orders.stream()
	                .filter(order -> order.getCustomers().getTier() == 2 && order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate))
	                .flatMap(order -> order.getProducts().stream())
	                .collect(Collectors.toList());
	    }




}

