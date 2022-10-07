package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "fornecedores")
public class Fornecedor {
    @Id
    private String id;
    private String razao, atividade, cnpj, inscricaoEstadual, site, email, endereco, bairro, cidade, estado, cep, observacao;
}
