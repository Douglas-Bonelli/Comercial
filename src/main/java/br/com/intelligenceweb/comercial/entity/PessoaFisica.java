package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PessoaFisica extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 9153637580087635041L;
	
	private String nome;
	private String cpf;
	private String rg;

}
