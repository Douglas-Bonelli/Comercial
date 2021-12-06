package br.com.intelligenceweb.comercial.serviceTest;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.intelligenceweb.comercial.entity.Cep;
import br.com.intelligenceweb.comercial.entity.Municipio;
import br.com.intelligenceweb.comercial.enums.UfEnum;
import br.com.intelligenceweb.comercial.repository.CepRepository;
import br.com.intelligenceweb.comercial.service.CepService;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("Test")
public class CepServiceTest {
	
	@MockBean
	CepRepository cepRepository;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void salvaCep() {
		
		//Cenario
		//Municipio
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
		 
		
		
		
	}

}
