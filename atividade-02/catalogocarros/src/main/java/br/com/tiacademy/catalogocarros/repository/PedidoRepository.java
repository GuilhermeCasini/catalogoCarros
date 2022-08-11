package br.com.tiacademy.catalogocarros.repository;

import br.com.tiacademy.catalogocarros.core.crud.CrudRepository;
import br.com.tiacademy.catalogocarros.domain.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
