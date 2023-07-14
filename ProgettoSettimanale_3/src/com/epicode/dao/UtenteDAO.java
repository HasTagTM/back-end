package com.epicode.dao;

import javax.persistence.EntityManager;

import com.epicode.model.Utente;
import com.epicode.util.JpaUtil;

public class UtenteDAO {

	public void save(Utente utente) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(utente);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.printf("Error saving object: " + utente.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}

    }

    public static Utente findByNumeroTessera(String numeroTessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Utente.class, numeroTessera);
		} finally {
			em.close();
		}
    }
	
}
