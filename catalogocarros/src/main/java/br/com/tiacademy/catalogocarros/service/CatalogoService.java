package br.com.tiacademy.catalogocarros.service;

import br.com.tiacademy.catalogocarros.core.crud.CrudService;
import br.com.tiacademy.catalogocarros.domain.Catalogo;
import org.springframework.stereotype.Service;

@Service
public class CatalogoService extends CrudService<Catalogo, Long> {

    @Override
    protected Catalogo editarEntidade(Catalogo recuperado, Catalogo entidade){
        recuperado.setNome(entidade.getNome());
        return recuperado;
    }
}
