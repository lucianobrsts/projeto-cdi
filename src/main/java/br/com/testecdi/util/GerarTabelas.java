package br.com.testecdi.util;

import javax.persistence.Persistence;

public class GerarTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("projeto-cdi");
	}

}
