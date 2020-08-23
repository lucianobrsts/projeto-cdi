package br.com.testecdi.service.impl;

import java.util.List;

import javax.inject.Inject;

import br.com.testecdi.repository.JpaGenericRepository;
import br.com.testecdi.service.GenericService;

public class GenericServiceImpl<T> implements GenericService<T> {

	@Inject
	private JpaGenericRepository<T> repository;

	@Override
	public void salvar(T entity) {
		repository.persist(entity);
	}

	@Override
	public void atualizar(T entity) {
		repository.update(entity);
	}

	@Override
	public void deletar(T entity) {
		repository.remove(entity);
	}

	@Override
	public T buscarPorId(Class<T> entityClass, Object id) {
		return null;
	}

	@Override
	public List<T> buscarTodos(Class<T> entityClass) {
		return repository.findAll();
	}
}
