package com.springcadastro.Component.Factory;

import com.springcadastro.Model.*;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorListagem {
    private String CABECALHO, LISTA_STRING, ENDERECO = System.getProperty("user.home") + "\\Downloads\\";

    public void geraArquivoListagemCliente(List<Cliente> lista){
        ENDERECO += "listaDeClientes.csv";
        CABECALHO = "ID;NOME;CPF;EMAIL;TELEFONE;CEP;ESTADO";
        LISTA_STRING = lista.stream().map(Cliente::formataObjeto).collect(Collectors.joining("\n"));

        geraArquivoListagem();
    }

    public void geraArquivoListagemFornecedor(List<Fornecedor> lista){
        ENDERECO += "listaDeFornecedores.csv";
        CABECALHO = "ID;RAZAO;CNPJ;EMAIL;SITE;CEP;ESTADO";
        LISTA_STRING = lista.stream().map(Fornecedor::formataObjeto).collect(Collectors.joining("\n"));

        geraArquivoListagem();
    }

    public void geraArquivoListagemProduto(List<Produto> lista){
        ENDERECO += "listaDeProdutos.csv";
        CABECALHO = "ID;NOME;ESPECIE;PRECO;QUANTIDADE;FORNECEDOR;DESCRICAO";
        LISTA_STRING = lista.stream().map(Produto::formataObjeto).collect(Collectors.joining("\n"));

        geraArquivoListagem();
    }

    public void geraArquivoListagemVenda(List<Venda> lista){
        ENDERECO += "listaDeVendas.csv";
        CABECALHO = "PRODUTO;CLIENTE;FORNECEDOR;SUBTOTAL;DATA";
        LISTA_STRING = lista.stream().map(Venda::formataObjeto).collect(Collectors.joining("\n"));

        geraArquivoListagem();
    }

    private void geraArquivoListagem() {
        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);
            escreve.print(LISTA_STRING);
            escreve.close();
        } catch (Exception ignored) {}
    }
}
