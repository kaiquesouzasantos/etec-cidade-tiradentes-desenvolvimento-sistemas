package com.springcadastro.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "clientes")
public class Cliente implements Model {
    @Id
    private String id;

    private String nome, cpf, email, endereco, bairro, cidade, estado, cep, telefone, observacao;

    @Override
    public String formataObjeto(){
        return
                getId() + ";" +
                getNome() + ";" +
                getCpf() + ";" +
                getEmail() + ";" +
                getTelefone() + ";" +
                getCep() + ";" +
                getEstado();
    }
}
