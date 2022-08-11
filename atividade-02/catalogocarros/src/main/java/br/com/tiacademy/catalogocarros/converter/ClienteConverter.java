package br.com.tiacademy.catalogocarros.converter;

import br.com.tiacademy.catalogocarros.core.crud.CrudConverter;
import br.com.tiacademy.catalogocarros.domain.Cliente;
import br.com.tiacademy.catalogocarros.dto.ClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements CrudConverter<Cliente, ClienteDTO> {

    @Override
    public ClienteDTO entidadeParaDto(Cliente entidade){

        return new ClienteDTO(entidade.getId(), entidade.getNome(),entidade.getEndereco());
    }

    @Override
    public Cliente dtoParaEntidade(ClienteDTO dto){
        return new Cliente(dto.getId(), dto.getNome(),dto.getEndereco());
    }

}
