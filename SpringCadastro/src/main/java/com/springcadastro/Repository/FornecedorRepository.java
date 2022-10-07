package com.springcadastro.Repository;

import com.springcadastro.Model.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, String>{}
