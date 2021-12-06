package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity(name="cep")
public class Cep implements Serializable{
	

	private static final long serialVersionUID = 5999958033196228624L;
	 
	 @Id
	 private String cep;
	 
	 @ManyToOne
	 private Municipio municipio;
	 
	 private String logradouro;
	 private String bairro;
	 
	 

}
