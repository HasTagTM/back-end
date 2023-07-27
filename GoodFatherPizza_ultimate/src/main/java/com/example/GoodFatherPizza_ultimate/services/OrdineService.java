package com.example.GoodFatherPizza_ultimate.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.GoodFatherPizza_ultimate.models.Menu;
import com.example.GoodFatherPizza_ultimate.models.Ordine;
import com.example.GoodFatherPizza_ultimate.models.Tavolo;

@Service
public class OrdineService {

	@Autowired @Qualifier("generaOrdine") ObjectProvider<Ordine> ordineProvider;
	@Autowired @Qualifier("generaTavolo") ObjectProvider<Tavolo> tavoloProvider;
	@Autowired @Qualifier("menu_pizzeria") ObjectProvider<Menu> menuProvider;
	
	
	public Ordine creaOrdine(Integer numeroOrdine, Integer numeroCoperti, Tavolo tavolo) {
		tavolo.setOccupato(true);
		Ordine o = ordineProvider.getObject();
		o.setNumeroOrdine(numeroOrdine);
		o.setNumeroCoperti(numeroCoperti);
		o.setTavolo(tavolo);
		return o;
		}
	
	public Tavolo generaTavolo(Integer numero, Integer numeroMassimoCoperti) {
		
		Tavolo tavolo = tavoloProvider.getObject();
		tavolo.setNumero(numero);
		tavolo.setNumeroMassimoCoperti(numeroMassimoCoperti);
		tavolo.setOccupato(false);
		return tavolo;
	}
	
	public Menu getMenu() {
		return menuProvider.getObject();
	}
	
}
