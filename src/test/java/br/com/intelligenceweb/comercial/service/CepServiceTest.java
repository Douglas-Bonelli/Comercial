package br.com.intelligenceweb.comercial.service;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.intelligenceweb.comercial.entity.Cep;
import br.com.intelligenceweb.comercial.repository.CepRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class CepServiceTest {
	
	@MockBean
	private CepRepository cepRepository;
	
	@Autowired
	private CepService cepService;
	
	@Before
	public void setUp() {
		BDDMockito.given(this.cepRepository.findByCep(Mockito.anyString())).willReturn(new Cep());
		BDDMockito.given(this.cepRepository.save(Mockito.any(Cep.class))).willReturn(new Cep());
	}
	
	@Test
	public void salvaCep() {
		
		Cep cep = this.cepService.save(new Cep());
		assertNotNull(cep);
		
		//Cenario
		//Municipio
		/*
		Municipio m = new Municipio();
		m.setNome("Porto Ferreira");
		m.setUf(UfEnum.SP);
		m.setIbge("1234");
		
	    //Cep
		Cep cep = new Cep();
		cep.setCep("13636085");
		cep.setLogradouro("Rua manoel Leme Franco");
		cep.setBairro("Jardim Santa Terezinha");
		cep.setMunicipio(m);
		*/ 
		 		
	}
	
	@Test
	public void consultaPorCep() {
		Optional<Cep> cep = this.cepService.findByCep("13636085");
		assertTrue(cep.isPresent());
	}

}
