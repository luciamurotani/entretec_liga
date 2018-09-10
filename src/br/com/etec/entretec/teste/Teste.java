package br.com.etec.entretec.teste;

import javax.persistence.EntityManager;

import br.com.etec.entretec.infra.JPAUtil;
import br.com.etec.entretec.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        Aluno entity = new Aluno();
        entity.setNome("b");
        entity.setEmailCorporativo("X");
     //   Endereco endereco = new Endereco();
     //   endereco.setCep("02206-000");
       // entity.setEndereco(endereco);
        em.persist(entity);
        
        em.getTransaction().commit();
        em.close();
	
	}

}
