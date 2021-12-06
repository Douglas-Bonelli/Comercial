package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.EnderecoTipo;
import br.com.intelligenceweb.comercial.repository.EnderecoTipoRepository;
import br.com.intelligenceweb.comercial.service.EnderecoTipoService;

@Service
public class EnderecoTipoServiceImp implements EnderecoTipoService {
	
	@Autowired
	EnderecoTipoRepository enderecoTipoRepository;

	@Override
	public EnderecoTipo save(EnderecoTipo enderecoTipo) {
		return enderecoTipoRepository.save(enderecoTipo);
	}

}
