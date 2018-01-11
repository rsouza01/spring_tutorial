package com.rsouza01.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Pessoa  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private String nome;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

}