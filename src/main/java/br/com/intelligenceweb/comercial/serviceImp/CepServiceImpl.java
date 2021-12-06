package br.com.intelligenceweb.comercial.serviceImp;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.Cep;
import br.com.intelligenceweb.comercial.repository.CepRepository;
import br.com.intelligenceweb.comercial.service.CepService;

@Service
public class CepServiceImpl implements CepService {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(CepServiceImpl.class);
	
	@Autowired
	CepRepository cepRepository;

	@Override
	public Cep save(Cep cep) {
		log.info("Persistindo cep {}" , cep);
		return this.cepRepository.save(cep);
	}

	@Override
	public Optional<Cep> findByCep(String codigoCep ) {
		log.info("Consultando o cep pelo código {}" , codigoCep );
		return Optional.ofNullable(this.cepRepository.findByCep(codigoCep));
	}

}
