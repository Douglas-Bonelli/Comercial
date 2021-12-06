package br.com.intelligenceweb.comercial.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelligenceweb.comercial.entity.RelacionamentoTipo;
import br.com.intelligenceweb.comercial.repository.RelacionamentoTipoRepository;
import br.com.intelligenceweb.comercial.service.RelacionamentoTipoService;

@Service
public class RelacionamentoTipoServiceImp implements RelacionamentoTipoService{
	
	@Autowired
	RelacionamentoTipoRepository pAtividadeRepository;

	@Override
	public RelacionamentoTipo salvar(RelacionamentoTipo pa) {
		return pAtividadeRepository.save(pa);
	}
	
	

}
