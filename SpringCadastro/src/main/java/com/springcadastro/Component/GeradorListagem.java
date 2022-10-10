package com.springcadastro.Component;

import com.springcadastro.Model.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class GeradorListagem {
    private final String SEPARACAO = ";";
    private String CABECALHO, ENDERECO = System.getProperty("user.home") + "\\Downloads\\";

    public void geraArquivoListagemCliente(List<Cliente> lista) {
        ENDERECO += "listaDeClientes.csv";
        CABECALHO = "ID;NOME;CPF;EMAIL;TELEFONE;CEP;ESTADO";

        try {
            PrintWriter escreve = new PrintWriter(new FileWriter(ENDERECO));
            escreve.println(CABECALHO);

            for (Cliente item : lista) {
                escreve.println(formataItem(item));
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
                escreve.println(formataItem(item));
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
                escreve.println(formataItem(item));
            }

            escreve.close();
        } catch (Exception ignored) {}
    }

    private String formataItem(Cliente cliente){
        return
                cliente.getId() + SEPARACAO +
                cliente.getNome() + SEPARACAO +
                cliente.getCpf() + SEPARACAO +
                cliente.getEmail() + SEPARACAO +
                cliente.getTelefone() + SEPARACAO +
                cliente.getCep() + SEPARACAO +
                cliente.getEstado();
    }

    private String formataItem(Fornecedor fornecedor){
        return
                fornecedor.getId() + SEPARACAO +
                fornecedor.getRazao() + SEPARACAO +
                fornecedor.getCnpj() + SEPARACAO +
                fornecedor.getEmail() + SEPARACAO +
                fornecedor.getSite() + SEPARACAO +
                fornecedor.getCep() + SEPARACAO +
                fornecedor.getEstado();
    }

    private String formataItem(Produto produto){
        return
                produto.getId() + SEPARACAO +
                produto.getNome() + SEPARACAO +
                produto.getEspecie() + SEPARACAO +
                "R$" + produto.getPreco() + SEPARACAO +
                produto.getQuantidade() + SEPARACAO +
                produto.getFornecedor() + SEPARACAO +
                produto.getDescricao();
    }
}
