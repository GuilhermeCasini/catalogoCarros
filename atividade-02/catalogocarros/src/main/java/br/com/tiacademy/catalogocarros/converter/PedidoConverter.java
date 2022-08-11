package br.com.tiacademy.catalogocarros.converter;

import br.com.tiacademy.catalogocarros.core.crud.CrudConverter;
import br.com.tiacademy.catalogocarros.domain.Pedido;
import br.com.tiacademy.catalogocarros.dto.PedidoDTO;
import org.springframework.stereotype.Component;

@Component
public class PedidoConverter implements CrudConverter<Pedido, PedidoDTO> {
    @Override
    public PedidoDTO entidadeParaDto(Pedido entidade) {
        return null;
    }

    @Override
    public Pedido dtoParaEntidade(PedidoDTO dto) {
        return null;
    }
}
