package com.rsouza01.common.DAO;

import com.rsouza01.common.model.Pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

public class PessoaDAO {

	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager pEntityManager){
		this.entityManager = pEntityManager;
	}


	public void persist(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}

	public List<Pessoa> findAll() {
		return entityManager.createQuery("SELECT p FROM Pessoa p").getResultList();
	}

}