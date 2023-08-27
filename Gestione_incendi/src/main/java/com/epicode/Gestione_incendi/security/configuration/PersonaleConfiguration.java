package com.epicode.Gestione_incendi.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Gestione_incendi.security.entity.Personale;

@Configuration
public class PersonaleConfiguration {

	@Bean("creaPersonale")
	@Scope("prototype")
	public Personale creaPersoanle() {
		return new Personale();
	}
	
	
}
