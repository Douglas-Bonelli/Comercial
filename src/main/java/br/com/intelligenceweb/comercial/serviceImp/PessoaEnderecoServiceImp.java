package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.PessoaEndereco;
import br.com.intelligenceweb.comercial.repository.PessoaEnderecoRepository;
import br.com.intelligenceweb.comercial.service.PessoaEnderecoService;

@Service
public class PessoaEnderecoServiceImp implements PessoaEnderecoService{
	
	@Autowired
	PessoaEnderecoRepository pessoaEnderecoRepository;

	@Override
	public PessoaEndereco salvar(PessoaEndereco pEndereco) {
		return pessoaEnderecoRepository.save(pEndereco);
	}


}
