package com.epicode.dao;

import javax.persistence.EntityManager;

import com.epicode.model.Location;
import com.epicode.util.JpaUtil;

public class LocationDAO {

	public void save(Location object) {
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

	public void refresh(Location object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.refresh(object);
		} finally {
			em.close();
		}

	}

	public Location getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			return em.find(Location.class, id);
		} finally {
			em.close();
		}

	}

	public void delete(Location object) {
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
