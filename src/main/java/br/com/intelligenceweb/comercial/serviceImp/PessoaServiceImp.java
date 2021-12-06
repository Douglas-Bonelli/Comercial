package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.Pessoa;
import br.com.intelligenceweb.comercial.repository.PessoaRepository;
import br.com.intelligenceweb.comercial.service.PessoaService;

@Service
public class PessoaServiceImp implements PessoaService{
	
	@Autowired
	PessoaRepository pessoaRepository;

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}
