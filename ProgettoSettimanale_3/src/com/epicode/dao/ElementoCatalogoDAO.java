package com.epicode.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.epicode.model.Catalogo;
import com.epicode.util.JpaUtil;

public class ElementoCatalogoDAO {

    public void save(Catalogo object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(object);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.printf("Error saving object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}
    }

    public void remove(String object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(object);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.printf("Error deleting object: " + object.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}
    }

    public Catalogo findByISBN(String codiceISBN) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Catalogo.class, codiceISBN);
		} finally {
			em.close();
		}
    }

    public List<Catalogo> findByAnnoPubblicazione(String annoPubblicazione) {
        // Logica per trovare gli elementiCatalogo nel database dato l'anno di pubblicazione
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return (List<Catalogo>) em.find(Catalogo.class, annoPubblicazione);
		} finally {
			em.close();
		}
    }

    public List<Catalogo> findByAutore(String autore) {
        // Logica per trovare gli elementiCatalogo nel database dato l'autore
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return (List<Catalogo>) em.find(Catalogo.class, autore);
		} finally {
			em.close();
		}
    }

    public List<Catalogo> findByTitolo(String titolo) {
        // Logica per trovare gli elementiCatalogo nel database dato il titolo
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return (List<Catalogo>) em.find(Catalogo.class, titolo);
		} finally {
			em.close();
		}
    }
	
}
