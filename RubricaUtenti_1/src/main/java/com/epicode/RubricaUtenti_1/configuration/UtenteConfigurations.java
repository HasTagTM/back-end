package com.epicode.RubricaUtenti_1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.epicode.RubricaUtenti_1.model.Utente;

@Configuration
public class UtenteConfigurations {

	@Bean("creaUtente")
	@Scope("prototype")
	public Utente creaUtente() {
		return new Utente();
	}
	
}
