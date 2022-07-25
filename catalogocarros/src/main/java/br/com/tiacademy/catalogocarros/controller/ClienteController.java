package br.com.tiacademy.catalogocarros.controller;

import br.com.tiacademy.catalogocarros.core.crud.CrudController;
import br.com.tiacademy.catalogocarros.domain.Cliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente,Long> {
}
