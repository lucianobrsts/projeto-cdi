package br.com.testecdi.repository;

import java.util.List;

public interface JpaGenericRepository<T> {

	public List<T> findAll();
	
	public T findById(Long id);
	
	public void persist(T entity);
	
	public void remove(T entity);
	
	public T update(T entity);
}
