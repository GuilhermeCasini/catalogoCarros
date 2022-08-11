package br.com.tiacademy.catalogocarros.domain;

import br.com.tiacademy.catalogocarros.core.crud.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido implements CrudDomain<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private Float valorTotal;

    @ManyToOne
    private Catalogo catalogo;

    @ManyToOne
    private Cliente cliente;
}
