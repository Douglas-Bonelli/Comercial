package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity( name= "relacionamento_tipo")
public class RelacionamentoTipo implements Serializable {
	
	private static final long serialVersionUID = -5560862907512476512L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricao;

}
