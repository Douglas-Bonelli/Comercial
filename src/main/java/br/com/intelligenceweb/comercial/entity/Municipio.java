package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.intelligenceweb.comercial.enums.UfEnum;



@Entity(name = "MUNICIPIO")
public class Municipio implements Serializable {
	
	private static final long serialVersionUID = -1357661635313613389L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 
	 private String ibge;
	 private String nome;
	 
	 @Enumerated(EnumType.STRING)
	 private UfEnum uf;
	 
	 
	 public Municipio() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIbge() {
		return ibge;
	}


	public void setIbge(String ibge) {
		this.ibge = ibge;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public UfEnum getUf() {
		return uf;
	}


	public void setUf(UfEnum uf) {
		this.uf = uf;
	}
	
	
	
	

	
	
	
	
	 
	 
	 
	
	

}
