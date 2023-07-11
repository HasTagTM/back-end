package com.epicode.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainProject {

	public static void main(String[] args) {
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("Lezione_12");
		EntityManager em = emf.createEntityManager();
	}

}

