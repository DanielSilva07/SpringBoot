package br.com.danielsilva.SpringBootExemplo;

import br.com.danielsilva.SpringBootExemplo.domain.Cliente;
import br.com.danielsilva.SpringBootExemplo.repository.IClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.danielsilva.SpringBootExemplo.repository")
@EntityScan("br.com.danielsilva.*")
@ComponentScan(basePackages = "br.com.danielsilva")
public class SpringBootExemploApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootExemploApplication.class);

	@Autowired
	private IClienteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExemploApplication.class, args);

	}


	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.nome("Spring Boot")
				.codigo("01")
				.build();
	}

}
