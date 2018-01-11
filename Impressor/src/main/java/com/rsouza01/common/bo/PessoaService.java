package com.rsouza01.common.bo;

import com.rsouza01.common.model.Pessoa;


public interface PessoaService {

	void gravar(Pessoa pessoa);
	void atualizar(Pessoa pessoa);
	void apagar(Pessoa pessoa);
	Pessoa findByPessoaId(String pessoaId);	

}