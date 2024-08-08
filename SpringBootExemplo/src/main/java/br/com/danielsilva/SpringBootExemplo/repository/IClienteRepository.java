package br.com.danielsilva.SpringBootExemplo.repository;

import br.com.danielsilva.SpringBootExemplo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente , Long> {
}
