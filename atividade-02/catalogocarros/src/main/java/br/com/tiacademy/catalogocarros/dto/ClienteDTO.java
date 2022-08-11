package br.com.tiacademy.catalogocarros.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO implements Serializable {

    private Long id;
    private String nome;
    private String endereco;
}
