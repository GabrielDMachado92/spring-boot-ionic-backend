package com.gdmachado.cursomc.dto;

import java.io.Serializable;

import javax.persistence.ExcludeSuperclassListeners;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.gdmachado.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min = 5, max = 80, message = "Minimo 5 e máximo 80 caracteres")
	private String nome;
	
	public CategoriaDTO() {}

	public Integer getId() {
		return id;
	}
	
	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
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
	
	

}
