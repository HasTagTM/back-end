package com.epicode.Gestione_incendi.security.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Gestione_incendi.security.entity.Sonda;

@Configuration
public class SondaConfiguration {

	@Bean("creaSonda")
	@Scope("prototype")
	public Sonda creaSonda() {
		return new Sonda();
	}
	
}
