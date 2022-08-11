package br.com.tiacademy.catalogocarros.domain;

import br.com.tiacademy.catalogocarros.core.crud.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalogo implements CrudDomain<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    private Integer Ano;
    private Integer valor;

}
