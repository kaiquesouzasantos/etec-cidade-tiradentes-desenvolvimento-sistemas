package com.springcadastro.Service;

import com.springcadastro.Model.Fornecedor;
import com.springcadastro.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public void save(Fornecedor fornecedor){
        this.fornecedorRepository.save(fornecedor);
    }

    public void delete(String id){
        this.fornecedorRepository.deleteById(id);
    }

    public Fornecedor getFornecedor(String id){
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        return fornecedor.orElse(null);
    }

    public List<Fornecedor> getListaFornecedor(){
        return fornecedorRepository.findAll();
    }
}
