package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    private String nome, cpf, email, endereco, bairro, cidade, estado, cep, telefone, observacao;
}
