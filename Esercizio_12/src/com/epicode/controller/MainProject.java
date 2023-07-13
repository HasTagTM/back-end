package com.epicode.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.epicode.model.JpaUtil;



public class MainProject {

	
	public static void main(String[] args) {
		JpaUtil jpaUtil = new JpaUtil();
		EntityManager em = jpaUtil.getEntityManagerFactory().createEntityManager();

	}

}
