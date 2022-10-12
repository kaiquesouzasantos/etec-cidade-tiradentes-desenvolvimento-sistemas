package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "vendas")
public class Venda implements Model {
    @Id
    private String id;

    private String codProduto, nomeProduto, nomeFornecedor, nomeCliente, subtotal, dataVenda;
    private int quantidade;

    @Override
    public String formataObjeto() {
        return
                getNomeProduto() + ";" +
                getNomeCliente() + ";" +
                getNomeFornecedor() + ";" +
                "R$" + getSubtotal()+ ";" +
                getDataVenda();
    }
}
