package br.com.tiacademy.catalogocarros.repository;

import br.com.tiacademy.catalogocarros.core.crud.CrudRepository;
import br.com.tiacademy.catalogocarros.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
