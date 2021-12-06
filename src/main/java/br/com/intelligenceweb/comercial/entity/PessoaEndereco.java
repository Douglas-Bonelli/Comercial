package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity( name="pessoa_endereco")
public class PessoaEndereco implements Serializable{
	
	private static final long serialVersionUID = -8144384272169431498L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@ManyToOne
	private Pessoa pessoa;
	
	
	@ManyToOne
	private Cep cep;
	
	
	@ManyToOne
	private EnderecoTipo enderecoTipo;
	
	
	
	private String numero;
	private String complemento;
	
	private Date inicioVig;
	private Date fimVig;
	
	
	@PrePersist
	public void prePersist() {
		this.inicioVig = new Date();
	}

}
