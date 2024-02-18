package com.springcadastro.Service;

import com.springcadastro.Model.Produto;
import com.springcadastro.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void save(Produto produto){
        this.produtoRepository.save(produto);
    }

    public void delete(String id){
        this.produtoRepository.deleteById(id);
    }

    public Produto getProduto(String id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    public List<Produto> getListaProduto(){
        return produtoRepository.findAll();
    }
}
