package com.sergio.archivobusiness.entity.repositorio;

import java.util.List;

public interface Repository<T, ID> {

	void save(T entity);
	
	void findByName(T entity);
	
	void findById(ID entity);
	
	void update(T entity);
	
	List<T> findAll();
	
}
