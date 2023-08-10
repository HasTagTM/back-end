package com.epicode.DeviceManagement_1.security.configuration;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.DeviceManagement_1.security.entity.Dipendente;

@Configuration
public class DipendenteConfiguration {

	@Bean("crea_dipendente")
	@Scope("prototype")
	public Dipendente creaDipendente() {
		return new Dipendente();
	}
	
	@Bean("creaDipendente_default")
	@Scope("prototype")
	public Dipendente ceraDipDefault(String nome, String reparto, Date dataAssunzione, String ruoloAziendale) {
		Dipendente d = new Dipendente();
		d.setNome(nome);
		d.setReparto(reparto);
		d.setDataAssunzione(dataAssunzione);
		d.setRuoloAziendale(ruoloAziendale);
		return d;
	}
	
}
