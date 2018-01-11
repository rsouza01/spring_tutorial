package com.rsouza01.common.dao.impl;

import com.rsouza01.common.model.Pessoa;
import com.rsouza01.common.dao.PessoaDAO;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PessoaDAOImpl extends HibernateDaoSupport implements PessoaDAO {

	public void gravar(Pessoa pessoa) {
		getHibernateTemplate().save(pessoa);
	}
	
	public void atualizar(Pessoa pessoa) {
		getHibernateTemplate().update(pessoa);
	}
	
	public void apagar(Pessoa pessoa) {
		getHibernateTemplate().delete(pessoa);
	}
	
	public Pessoa findByPessoaId(String pessoaId) {
		List list = getHibernateTemplate().find(
                      "from tb_pessoa where id=?", pessoaId);
		return (Pessoa)list.get(0);	}
	

}