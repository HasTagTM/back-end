package com.epicode.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.epicode.model.Catalogo;
import com.epicode.model.Prestito;
import com.epicode.util.JpaUtil;

public class PrestitoDAO {

	public void save(Prestito prestito) {
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(prestito);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.printf("Error saving object: " + prestito.getClass().getSimpleName(), ex);
			throw ex;

		} finally {
			em.close();
		}
    }

    public static List<Prestito> findPrestitiInCorsoByUtente(String numeroTessera) {
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return (List<Prestito>) em.find(Catalogo.class, numeroTessera);
		} finally {
			em.close();
		}
    }

    public List<Prestito> findPrestitiScadutiNonRestituiti() {
    	EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(null, Catalogo.class);
		} finally {
			em.close();
		}
    }
	
}
