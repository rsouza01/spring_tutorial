package com.rsouza01.common.dao;

import com.rsouza01.common.model.Pessoa;

public interface PessoaDAO {

	void gravar(Pessoa pessoa);
	void atualizar(Pessoa pessoa);
	void apagar(Pessoa pessoa);
	Pessoa findByPessoaId(String pessoaId);	

}