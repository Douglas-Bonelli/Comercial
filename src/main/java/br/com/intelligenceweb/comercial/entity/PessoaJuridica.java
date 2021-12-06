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
public class PessoaJuridica extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 8416273658032203388L;
	
	private String razaoSocial;
	private String cnpj;

}
