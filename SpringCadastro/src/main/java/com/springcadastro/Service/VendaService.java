package com.springcadastro.Service;

import com.springcadastro.Model.*;
import com.springcadastro.Repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ProdutoService produtoService;

    public boolean venda(Venda venda){
        Produto produto = this.produtoService.getProduto(venda.getCodProduto());

        if(produto.getQuantidade() >= venda.getQuantidade()){
            this.vendaRepository.save(venda);
            produto.setQuantidade(produto.getQuantidade() - venda.getQuantidade());
            this.produtoService.save(produto);
            return true;
        }

        return false;
    }

    public List<Venda> getListaVenda(){
        return this.vendaRepository.findAll();
    }
}
