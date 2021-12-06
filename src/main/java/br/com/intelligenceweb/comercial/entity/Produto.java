package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Produto implements Serializable{


	private static final long serialVersionUID = -5853419047106584052L;
	
	private Long id;
	private String nome;
	private String codBarra;
	private String descricao;


}
