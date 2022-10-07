package com.springcadastro.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    private String nome, cpf, email, endereco, bairro, cidade, estado, cep, telefone, observacao;
}
