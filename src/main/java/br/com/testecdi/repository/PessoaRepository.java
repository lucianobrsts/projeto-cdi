package br.com.testecdi.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.testecdi.domain.Pessoa;

public class PessoaRepository implements Serializable {

	private static final long serialVersionUID = 3392864341547026077L;

	private EntityManager manager;

	@Inject
	public PessoaRepository(EntityManager manager) {
		this.manager = manager;
	}

	public void salvar(Pessoa pessoa) {
		this.manager.persist(pessoa);
	}

	public void excluir(Pessoa pessoa) {
		this.manager.remove(manager.getReference(Pessoa.class, pessoa.getCodigo()));
	}

	public Pessoa porId(Integer codigo) {
		return this.manager.find(Pessoa.class, codigo);
	}
	
	public List<Pessoa> todos() {
		TypedQuery<Pessoa> query = manager.createQuery("from Pesspa", Pessoa.class);
		return query.getResultList();
	}

}
