package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaPreco implements Serializable{
	
	private static final long serialVersionUID = -8108683586101912352L;
	
	private Long id;
	private String nome;
	private String descricao;
	private Date inicioVig;
	private Date fimVig;
	
	private List<Produto> listaProdutos;

}
