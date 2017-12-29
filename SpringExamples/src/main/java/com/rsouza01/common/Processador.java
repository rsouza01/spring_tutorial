package com.rsouza01.common;

/**
	* Spring bean
	*
*/
public class Processador {
	private FonteDados fonteDados;
	private Impressor impressor;
	
	public setFonteDados(FonteDados pFonteDados){
		this.fonteDados = pFonteDados;
	}

	public setImpressor(Impressor pImpressor){
		this.Impressor = pImpressor;
	}
}
