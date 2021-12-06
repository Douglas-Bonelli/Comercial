package br.com.intelligenceweb.comercial.service;

import java.util.Optional;

import br.com.intelligenceweb.comercial.entity.Cep;

public interface CepService {
	
	/**
	 * Persiste um novo Cep no banco de dados
	 * @param cep
	 * @return cep
	 */
	Cep save(Cep cep);
	
	/**
	 * Consulta o Cep pela Codigo
	 * @param codigo
	 * @return Cep
	 */
	Optional<Cep> findByCep(String codigoCep );

}
