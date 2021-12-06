package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 5278729992483217256L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public Date dataCadastro;
	public Date dataAtualizacao;
	
	
	
	@PrePersist
	void DataCadastro(){
		this.dataAtualizacao = new Date();
		this.dataCadastro = new Date();
	}
	
	@PreUpdate
	void DataAtualizacao() {
		this.dataAtualizacao = new Date();
	}
	
	

}
