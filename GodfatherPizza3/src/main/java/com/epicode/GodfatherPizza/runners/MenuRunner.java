package com.epicode.GodfatherPizza.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.epicode.GodfatherPizza.service.MenuService;

public class MenuRunner implements CommandLineRunner{

	@Autowired MenuService menu;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		menu.stampaMenu();
	}
	
}
