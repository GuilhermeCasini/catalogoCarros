package br.com.tiacademy.catalogocarros.controller;

import br.com.tiacademy.catalogocarros.core.crud.CrudController;
import br.com.tiacademy.catalogocarros.domain.Pedido;
import br.com.tiacademy.catalogocarros.dto.PedidoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController extends CrudController<Pedido, PedidoDTO, Long> {
}
