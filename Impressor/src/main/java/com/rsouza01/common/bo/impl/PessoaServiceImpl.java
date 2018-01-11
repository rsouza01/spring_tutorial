package com.rsouza01.common.bo.impl;

import com.rsouza01.common.model.Pessoa;
import com.rsouza01.common.bo.PessoaService;
import com.rsouza01.common.dao.PessoaDAO;


public class PessoaServiceImpl implements  PessoaService {


	PessoaDAO pessoaDAO = null;
	
	public void setPessoaDAO(PessoaDAO pPessoaDAO) {
		this.pessoaDAO = pPessoaDAO;
	}
	
	public void gravar(Pessoa pessoa) {
		pessoaDAO.gravar(pessoa);
	}
	
	public void atualizar(Pessoa pessoa) {
		pessoaDAO.atualizar(pessoa);
	}
	
	public void apagar(Pessoa pessoa) {
		pessoaDAO.apagar(pessoa);
	}

	public Pessoa findByPessoaId(String pessoaId) {
		return pessoaDAO.findByPessoaId(pessoaId);
	}

}