package br.com.tiacademy.catalogocarros.controller;

import br.com.tiacademy.catalogocarros.core.crud.CrudController;
import br.com.tiacademy.catalogocarros.domain.Catalogo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController extends CrudController<Catalogo, Long> {
}
