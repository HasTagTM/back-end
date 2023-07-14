package com.epicode.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JpaUtil {
	

	private static final EntityManagerFactory entityManagerFactory;

	static {
		try {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("ProgettoSettimanale3");
		} catch (Throwable ex) {
			System.out.println("Initial EntityManagerFactory creation failed.");
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

} 
