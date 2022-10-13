package com.springcadastro.Service;

import com.springcadastro.Model.Cliente;
import com.springcadastro.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void save(Cliente cliente){
        this.clienteRepository.save(cliente);
    }

    public void delete(String id){
        this.clienteRepository.deleteById(id);
    }

    public Cliente getCliente(String id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    public List<Cliente> getListaCliente(){
        return clienteRepository.findAll();
    }
}
