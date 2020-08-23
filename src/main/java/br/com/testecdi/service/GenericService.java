package br.com.testecdi.service;

import java.util.List;

public interface GenericService<T> {

	public void salvar(T entity);
	
	public void atualizar(T entity);

	public void deletar(T entity);
	
	public T buscarPorId(Class<T> entityClass, Object id);

	public List<T> buscarTodos(Class<T> entityClass);
}
