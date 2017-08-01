package com.volunteer.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class JPADao<E> implements Dao<E> {
	
	protected EntityManager entityManager;
	
	public JPADao() {
		try {
		entityManager = Persistence.createEntityManagerFactory("cs544").createEntityManager();
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}

	@Override
	public void persist(E entity) {
		entityManager.persist(entity);
	}

	@Override
	public void remove(E entity) {
		entityManager.remove(entity);
	}

}
