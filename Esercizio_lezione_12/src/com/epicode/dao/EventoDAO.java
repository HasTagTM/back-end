package com.epicode.dao;

import javax.persistence.EntityManager;

import com.epicode.model.Evento;
import com.epicode.util.JpaUtil;



	public class EventoDAO {


		public void save(Evento object) {
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

		public void refresh(Evento object) {
			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.refresh(object);
			} finally {
				em.close();
			}

		}

		public Evento getById(Long id) {
			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
			try {
				return em.find(Evento.class, id);
			} finally {
				em.close();
			}

		}

		public void delete(Evento object) {
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
