package com.springcadastro.Pattern;

import com.springcadastro.Model.Produto;

public class ProdutoPattern {
    private final Produto produto;

    public ProdutoPattern(Produto produto) {
        this.produto = produto;
    }

    public boolean verifica(){
        return verificaPreenchimento();
    }

    private boolean verificaPreenchimento(){
        if(produto.getNome().isEmpty() || produto.getEspecie().isEmpty() || produto.getFornecedor().isEmpty()){
            return false;
        }

        return true;
    }
}
