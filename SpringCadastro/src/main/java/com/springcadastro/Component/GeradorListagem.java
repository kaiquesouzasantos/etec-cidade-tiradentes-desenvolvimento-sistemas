package com.springcadastro.Component;

import com.springcadastro.Model.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class GeradorListagem {
    private String CABECALHO, ENDERECO = System.getProperty("user.home") + "\\Downloads\\";

    public void geraArquivoListagemCliente(List<Cliente> lista) {
        ENDERECO += "listaDeClientes.csv";
        CABECALHO = "ID;NOME;CPF;EMAIL;TELEFONE;CEP;ESTADO";

        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);

            for (Cliente item : lista) {
                escreve.println(item.formataObjeto());
            }

            escreve.close();
        } catch (Exception ignored) {}
    }

    public void geraArquivoListagemFornecedor(List<Fornecedor> lista) {
        ENDERECO += "listaDeFornecedores.csv";
        CABECALHO = "ID;RAZAO;CNPJ;EMAIL;SITE;CEP;ESTADO";

        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);

            for (Fornecedor item : lista) {
                escreve.println(item.formataObjeto());
            }

            escreve.close();
        } catch (Exception ignored) {}
    }

    public void geraArquivoListagemProduto(List<Produto> lista) {
        ENDERECO += "listaDeProdutos.csv";
        CABECALHO = "ID;NOME;ESPECIE;PRECO;QUANTIDADE;FORNECEDOR;DESCRICAO";

        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);

            for (Produto item : lista) {
                escreve.println(item.formataObjeto());
            }

            escreve.close();
        } catch (Exception ignored) {}
    }

    public void geraArquivoListagemVenda(List<Venda> lista) {
        ENDERECO += "listaDeVendas.csv";
        CABECALHO = "PRODUTO;CLIENTE;FORNECEDOR;SUBTOTAL;DATA";

        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);

            for (Venda item : lista) {
                escreve.println(item.formataObjeto());
            }

            escreve.close();
        } catch (Exception ignored) {}
    }
}
