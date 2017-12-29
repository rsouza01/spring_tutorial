package com.rsouza01.common.impl;

import com.rsouza01.common.Pessoa;

public interface FonteDadosArquivo {

	private string arquivo;
	
    public void setArquivo(string pArquivo)
    {
    	this.arquivo = pArquivo;
    }


	public List<Pessoa> getPessoas()
	{
	    return new ArrayList<Pessoa>();
	}
}
