package com.epicode.GodfathersPizza1.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.GodfathersPizza1.controller.GestioneMenu;

@Component
public class MenuRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		GestioneMenu menu = new GestioneMenu();
		menu.stampaMenu();
	}

	
	
}
