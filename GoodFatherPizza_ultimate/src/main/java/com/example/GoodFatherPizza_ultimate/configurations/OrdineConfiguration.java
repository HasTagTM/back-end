package com.example.GoodFatherPizza_ultimate.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.example.GoodFatherPizza_ultimate.models.Ordine;
import com.example.GoodFatherPizza_ultimate.models.Tavolo;

@Configuration
@PropertySource("classpath:application.properties")
public class OrdineConfiguration {

	@Bean("generaOrdine")
	@Scope("singletone")
	public Ordine generaOrdine() {
		Ordine o = new Ordine();
		o.setStatoOrdine(null);
		o.setOraAcquisizioneOrdine(null);
		o.setCostoCoperto(null);
		return o;
	}
	
	@Bean("generaTavolo")
	@Scope("prototype")
	public Tavolo generaTavolo() {
		Tavolo tavolo = new Tavolo();
		return tavolo;
	}
}
