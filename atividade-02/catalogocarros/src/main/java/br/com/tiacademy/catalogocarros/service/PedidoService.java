package br.com.tiacademy.catalogocarros.service;

import br.com.tiacademy.catalogocarros.core.crud.CrudService;
import br.com.tiacademy.catalogocarros.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends CrudService<Pedido, Long> {

    @Override
    protected Pedido editarEntidade(Pedido recuperado, Pedido entidade){
        recuperado.setValorTotal(entidade.getValorTotal());
        return recuperado;
    }
}

