package br.com.intelligenceweb.comercial.entity.key;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import br.com.intelligenceweb.comercial.entity.Pessoa;
import br.com.intelligenceweb.comercial.entity.RelacionamentoTipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PessoaRelacionamentoTipoID implements Serializable{
	

	private static final long serialVersionUID = -8630705849487101648L;
	
	private Long pessoaId;
	private Long relacionamentoTipoId;
	private Date inicioVig;
	
	
	public PessoaRelacionamentoTipoID(Pessoa pessoa , RelacionamentoTipo relacionamento) {
		this.pessoaId = pessoa.getId();
		this.relacionamentoTipoId = relacionamento.getId();
		this.inicioVig = new Date();
	}

}
