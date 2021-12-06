package br.com.intelligenceweb.comercial.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.PrePersist;

import br.com.intelligenceweb.comercial.entity.key.PessoaRelacionamentoTipoID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity( name="Pessoa_Relacionamento")
public class PessoaRelacionamentoTipo implements Serializable {
	
	
	private static final long serialVersionUID = 8060813672710575893L;
	
	@EmbeddedId
    private PessoaRelacionamentoTipoID PessoaRelacionamentoTipoID;
	
	
	private Date fimVig;

}
