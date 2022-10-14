package com.springcadastro.Component.Factory;

import com.springcadastro.Model.*;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Data
public class GeradorRelatorio {
    private transient List<Cliente> listaCliente;
    private transient List<Fornecedor> listaFornecedor;
    private transient List<Produto> listaProduto;
    private transient List<Venda> listaVenda;

    private volatile int numeroClientes, numeroFornecedores, numeroProdutos, numeroVendas, estoqueProdutos;
    private volatile double mediaPrecoProdutos, valorEstoque;

    public GeradorRelatorio(List<Cliente> listaCliente,List<Fornecedor> listaFornecedor, List<Produto> listaProduto, List<Venda> listaVenda) {
        try{
            preencheListas(listaCliente, listaFornecedor, listaProduto, listaVenda);
            geraRelatorio();
        } catch (Exception ignored){}
    }

    private synchronized void preencheListas(
            List<Cliente> listaCliente,List<Fornecedor> listaFornecedor, List<Produto> listaProduto, List<Venda> listaVenda
    ){
        this.listaCliente = listaCliente;
        this.listaFornecedor = listaFornecedor;
        this.listaProduto = listaProduto;
        this.listaVenda = listaVenda;
    }

    private void geraRelatorio(){
        numeroDeComponentes();
        estoqueProdutos();
        mediaPrecoProduto();
        valorEstoqueProdutos();
    }

    private Stream<Cliente> getStreamCliente(){
        return this.listaCliente.stream();
    }

    private Stream<Fornecedor> getStreamFornecedor(){
        return this.listaFornecedor.stream();
    }

    private Stream<Produto> getStreamProduto(){
        return this.listaProduto.stream();
    }

    private Stream<Venda> getStreamVenda(){
        return this.listaVenda.stream();
    }

    private void numeroDeComponentes(){
        numeroClientes = (int) getStreamCliente().count();
        numeroFornecedores = (int) getStreamFornecedor().count();
        numeroProdutos = (int) getStreamProduto().count();
        numeroVendas = (int) getStreamVenda().count();
    }

    private void estoqueProdutos(){
        Optional<Integer> estoque = getStreamProduto()
                .map(Produto::getQuantidade)
                .reduce(Integer::sum);

        this.estoqueProdutos = estoque.orElse(0);
    }

    private void valorEstoqueProdutos(){
        Optional<Double> valor = getStreamProduto()
                .map(produto -> produto.getQuantidade() * produto.getPreco())
                .reduce(Double::sum);

        this.valorEstoque = valor.orElse(0.0);
    }

    private void mediaPrecoProduto(){
        Optional<Double> mediaPreco = getStreamProduto()
                .map(Produto::getPreco)
                .reduce(Double::sum).map(soma -> soma / numeroClientes);

        this.mediaPrecoProdutos = mediaPreco.orElse(0.0);
    }
}
