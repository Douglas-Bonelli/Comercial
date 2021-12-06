package br.com.intelligenceweb.comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.intelligenceweb.comercial.entity.Cep;

public interface CepRepository extends JpaRepository<Cep, Long>{
	
	@Transactional(readOnly=true)
	@Query( value = "select * from cep where cep = :p_codCep" , nativeQuery = true)
	Cep findByCep(@Param("p_codCep")  String codCep );

}
