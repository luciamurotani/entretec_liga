package br.com.etec.entretec.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static  EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("ENTRETEC"); //Colocar o nome da persistence-unit
	
	public EntityManager getEntityManager(){
		return entityManager.createEntityManager();  
	}
}
