package br.com.tiacademy.catalogocarros.service;

import br.com.tiacademy.catalogocarros.core.crud.CrudService;
import br.com.tiacademy.catalogocarros.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends CrudService<Cliente,Long> {
    @Override
    protected Cliente editarEntidade(Cliente recuperado, Cliente entidade){
        recuperado.setNome(entidade.getNome());
        return recuperado;
    }
}
