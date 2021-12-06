package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.Municipio;
import br.com.intelligenceweb.comercial.repository.MunicipioRepository;
import br.com.intelligenceweb.comercial.service.MunicipioService;

@Service
public class MunicipioServiceImp implements MunicipioService {
	
	@Autowired
	MunicipioRepository municipioRepository;

	
	@Override
	public Municipio salvar(Municipio municipio) {
		return municipioRepository.save(municipio);
	}

}
