package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.PessoaRelacionamentoTipo;
import br.com.intelligenceweb.comercial.repository.PessoaRelacionamentoTipoRepository;
import br.com.intelligenceweb.comercial.service.PessoaRelacionamentoTipoService;

@Service
public class PessoaRelacionamentoTipoServiceImp implements PessoaRelacionamentoTipoService{
	
	@Autowired
	PessoaRelacionamentoTipoRepository pessoaRelacionamentoTipoRepository;

	@Override
	public PessoaRelacionamentoTipo salvar(PessoaRelacionamentoTipo pessoaRelacionamentoTipo) {
		return pessoaRelacionamentoTipoRepository.save(pessoaRelacionamentoTipo);
	}

}
