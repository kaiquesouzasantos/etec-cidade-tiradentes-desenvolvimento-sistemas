package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "produtos")
public class Produto {
    @Id
    private String id;

    private String nome, descricao, especie, fornecedor;
    private double preco;
    private int quantidade;
}
