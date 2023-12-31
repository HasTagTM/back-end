package com.epicode.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.epicode.model.Partecipazione;
import com.epicode.util.JpaUtil;

public class PartecipazioneDao {

	public void save(Partecipazione object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.persist(object);

			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();

			System.out.println("Error saving object: " + object.getClass().getSimpleName());
			throw ex;

		} finally {
			em.close();
		}

	}

	public void refresh(Partecipazione object) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			em.refresh(object);

		} finally {
			em.close();
		}

	}

	public Partecipazione getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			return em.find(Partecipazione.class, id);

		} finally {
			em.close();
		}

	}

	public void delete(Partecipazione object) {
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
