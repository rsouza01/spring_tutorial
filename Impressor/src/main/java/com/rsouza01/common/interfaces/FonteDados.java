package com.rsouza01.common.interfaces;

import com.rsouza01.common.Pessoa;
import java.util.*;

public interface FonteDados {

    public void setArquivo(String pArquivo);
    
	public List<Pessoa> getPessoas();
}
