package br.com.testecdi.util.jpa;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProducer {

	private EntityManagerFactory factory;

	public EntityManagerProducer() {
		factory = Persistence.createEntityManagerFactory("projeto-cdi");
	}

	@Produces
	@RequestScoped
	public EntityManager createentityManager() {
		return factory.createEntityManager();
	}

	public void closeEntityManager(@Disposes EntityManager em) {
		em.close();
	}

}
