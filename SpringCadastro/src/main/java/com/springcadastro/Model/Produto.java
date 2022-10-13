package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "produtos")
public class Produto implements Model {
    @Id
    private String id;

    private String nome, descricao, especie, razaoFornecedor;
    private double preco;
    private int quantidade;

    @Override
    public String formataObjeto(){
        return
                getId() + ";" +
                getNome() + ";" +
                getEspecie() + ";" +
                "R$" + getPreco() + ";" +
                getQuantidade() + ";" +
                getRazaoFornecedor() + ";" +
                getDescricao();
    }
}
