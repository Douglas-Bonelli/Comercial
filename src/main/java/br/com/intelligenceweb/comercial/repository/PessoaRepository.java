package br.com.intelligenceweb.comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelligenceweb.comercial.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
