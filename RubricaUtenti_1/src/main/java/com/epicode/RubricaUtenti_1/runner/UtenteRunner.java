package com.epicode.RubricaUtenti_1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.RubricaUtenti_1.model.Utente;
import com.epicode.RubricaUtenti_1.service.UtenteService;

@Component
public class UtenteRunner implements CommandLineRunner{

	@Autowired UtenteService utenteSvc;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run...");
		for(int i = 0; i < 10; i++) {
		Utente utenteFake = utenteSvc.creaUtenteFaker();
		}
	}

}
