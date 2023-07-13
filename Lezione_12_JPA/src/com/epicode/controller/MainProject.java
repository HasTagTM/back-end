package com.epicode.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainProject {

	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("Lezione_12");
	static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
	}

}

