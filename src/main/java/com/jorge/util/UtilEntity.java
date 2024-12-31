package com.jorge.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilEntity {

	private static final EntityManagerFactory factory = buildEntityManagerFactory();
	
	private static EntityManagerFactory buildEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("myPersistenceUnit");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
