package com.rsouza01.common;

import com.rsouza01.common.interfaces.FonteDados;
import com.rsouza01.common.interfaces.Impressor;

public class Processador {
	
	private FonteDados fonteDados;
	private Impressor impressor;
	
	public void setFonteDados(FonteDados pFonteDados){
		this.fonteDados = pFonteDados;
	}

	public void setImpressor(Impressor pImpressor){
		this.impressor = pImpressor;
	}
	
	public void processe(){
		System.out.println("\n\nProcessador.processe()");
	}
}
