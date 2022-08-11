package br.com.tiacademy.catalogocarros.converter;

import br.com.tiacademy.catalogocarros.core.crud.CrudConverter;
import br.com.tiacademy.catalogocarros.domain.Catalogo;
import br.com.tiacademy.catalogocarros.dto.CatalogoDTO;
import org.springframework.stereotype.Component;

@Component
public class CatalogoConverter implements CrudConverter<Catalogo, CatalogoDTO> {

    @Override
    public CatalogoDTO entidadeParaDto(Catalogo entidade) {


        return new CatalogoDTO(entidade.getId(), entidade.getNome(), entidade.getCor(),entidade.getAno(), entidade.getValor());
    }

    @Override
    public Catalogo dtoParaEntidade(CatalogoDTO dto) {
        return new Catalogo(dto.getId(), dto.getNome(), dto.getCor(), dto.getAno(),dto.getValor());
    }

}
