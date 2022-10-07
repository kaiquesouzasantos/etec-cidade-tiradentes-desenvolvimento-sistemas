package com.springcadastro.Pattern;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.springcadastro.Model.Cliente;

public class ClientePattern {
    private final Cliente cliente;

    public ClientePattern(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean verificacao(){
        return verificaPreenchimento() && verificaCPF();
    }

    private boolean verificaPreenchimento(){
        if(
                cliente.getNome().isEmpty() || cliente.getCpf().isEmpty() ||
                cliente.getEmail().isEmpty() || cliente.getEndereco().isEmpty() ||
                cliente.getBairro().isEmpty() || cliente.getCidade().isEmpty() ||
                cliente.getEstado().isEmpty() || cliente.getCep().isEmpty()
        ){
            return false;
        }

        return true;
    }

    private boolean verificaCPF(){
        try{
            new CPFValidator().assertValid(this.cliente.getCpf());
            return true;
        } catch (InvalidStateException ignored){}

        return false;
    }
}
