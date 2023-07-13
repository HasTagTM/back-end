package com.epicode.dao;

import javax.persistence.EntityManager;

import com.epicode.model.Persona;
import com.epicode.util.JpaUtil;

public class PersonaDAO {

	public void save(Persona object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			em.getTransaction().begin();
			em.persist(object);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.println("Error saving object: " + object.getClass().getSimpleName());
			throw ex;

		} finally {
			em.close();
		}

	}

	public void refresh(Persona object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.refresh(object);
		} finally {
			em.close();
		}

	}

	public Persona getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Persona.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Persona object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(object);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Error deleting object: " + object.getClass().getSimpleName());
			throw ex;

		} finally {
			em.close();
		}

	}

}
