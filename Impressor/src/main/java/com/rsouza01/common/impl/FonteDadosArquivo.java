package com.rsouza01.common.impl;

import com.rsouza01.common.interfaces.FonteDados;
import com.rsouza01.common.Pessoa;
import java.util.*;

public class FonteDadosArquivo implements FonteDados {

	private String arquivo;
	
    public void setArquivo(String pArquivo)
    {
    	this.arquivo = pArquivo;
    }


	public List<Pessoa> getPessoas()
	{
	    return new ArrayList<Pessoa>();
	}
}