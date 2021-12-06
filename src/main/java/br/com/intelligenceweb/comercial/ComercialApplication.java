package br.com.intelligenceweb.comercial;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.intelligenceweb.comercial.entity.Cep;
import br.com.intelligenceweb.comercial.entity.EnderecoTipo;
import br.com.intelligenceweb.comercial.entity.Municipio;
import br.com.intelligenceweb.comercial.entity.Pessoa;
import br.com.intelligenceweb.comercial.entity.PessoaEndereco;
import br.com.intelligenceweb.comercial.entity.RelacionamentoTipo;
import br.com.intelligenceweb.comercial.entity.key.PessoaRelacionamentoTipoID;
import br.com.intelligenceweb.comercial.entity.PessoaFisica;
import br.com.intelligenceweb.comercial.entity.PessoaRelacionamentoTipo;
import br.com.intelligenceweb.comercial.enums.UfEnum;
import br.com.intelligenceweb.comercial.service.CepService;
import br.com.intelligenceweb.comercial.service.EnderecoTipoService;
import br.com.intelligenceweb.comercial.service.MunicipioService;
import br.com.intelligenceweb.comercial.service.PessoaEnderecoService;
import br.com.intelligenceweb.comercial.service.PessoaRelacionamentoTipoService;
import br.com.intelligenceweb.comercial.service.RelacionamentoTipoService;
import br.com.intelligenceweb.comercial.service.PessoaService;

@SpringBootApplication
public class ComercialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
	}
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MunicipioService municipioService;
	
	@Autowired
	CepService cepService;
	
	@Autowired
	EnderecoTipoService etService;
	
	@Autowired
	RelacionamentoTipoService relacionamentoService;
	
	@Autowired
	PessoaService pessoaService;
	
	@Autowired
	PessoaRelacionamentoTipoService pessoaRelacService;
	
	@Autowired
	PessoaEnderecoService pessoaEnderecoService;


	@Override
	public void run(String... args) throws Exception {
		
		
		
		 System.out.println("Inicio do Processo");
		 
		 Municipio m = new Municipio();
		 m.setNome("Porto Ferreira");
		 m.setUf(UfEnum.SP);
		 m.setIbge("1234");
		 municipioService.salvar(m);
		 		 
		 Cep cep = new Cep();
		 cep.setCep("13636085");
		 cep.setLogradouro("Rua manoel Leme Franco");
		 cep.setBairro("Jardim Santa Terezinha");
		 cep.setMunicipio(m); 
		 cepService.save(cep);
		 
		 log.info("Insert cep -> {}" , cep );
		 
		 
		 Optional<Cep> CepOpt = cepService.findByCep("13636085");
		 log.info("Find By cep -> {}" , CepOpt );
		 
		 
		 
		 /*
		 EnderecoTipo endeTipo = new EnderecoTipo();
		 endeTipo.setDescricao("Comercial");
		 etService.save(endeTipo);
		 
		 RelacionamentoTipo relacionamento = new  RelacionamentoTipo();
		 relacionamento.setDescricao("Cliente");
		 relacionamentoService.salvar(relacionamento);
		 
		 PessoaFisica f = new PessoaFisica();
		 f.setNome("Douglas");
		 f.setCpf("27405981810");
		 f.setRg("330700340");
		 pessoaService.salvar(f);
		 
		 
		 PessoaRelacionamentoTipo relacTipo = new PessoaRelacionamentoTipo();
		 relacTipo.setPessoaRelacionamentoTipoID(new PessoaRelacionamentoTipoID(f,relacionamento));
		 pessoaRelacService.salvar(relacTipo);
		 
		 
		 PessoaEndereco pe = new PessoaEndereco();
		 pe.setPessoa(f);
		 pe.setComplemento("Ap 116 Torre 1");
		 pe.setNumero("1100");
		 pe.setCep(cep);
		 pe.setEnderecoTipo(endeTipo);
		 pessoaEnderecoService.salvar(pe);
		 
		  
		 System.out.println("Fim do Processo");
		 */
	}

}
