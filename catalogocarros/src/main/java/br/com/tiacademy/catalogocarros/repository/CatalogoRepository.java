package br.com.tiacademy.catalogocarros.repository;

import br.com.tiacademy.catalogocarros.core.crud.CrudRepository;
import br.com.tiacademy.catalogocarros.domain.Catalogo;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends CrudRepository<Catalogo, Long> {
}
