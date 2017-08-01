package com.volunteer.dao;

public interface Dao<E> {
	
	void persist(E entity);
	
    void remove(E entity);

}
