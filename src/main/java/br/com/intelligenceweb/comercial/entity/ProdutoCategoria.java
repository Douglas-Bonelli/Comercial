package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoCategoria implements Serializable{
	
	private static final long serialVersionUID = -3057200418220744100L;
	
	private Long id;
	private String descricao;

}
