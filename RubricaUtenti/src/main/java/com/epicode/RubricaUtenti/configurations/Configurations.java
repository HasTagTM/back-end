package com.epicode.RubricaUtenti.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.RubricaUtenti.models.Utente;

@Configuration
public class Configurations {

	@Bean("creaUtente")
	@Scope("prototype")
	public Utente creaUtente() {
		return new Utente();
	}
	
}
