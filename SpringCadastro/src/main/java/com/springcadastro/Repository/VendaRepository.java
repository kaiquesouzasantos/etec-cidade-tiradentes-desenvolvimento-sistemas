package com.springcadastro.Repository;

import com.springcadastro.Model.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {
}
