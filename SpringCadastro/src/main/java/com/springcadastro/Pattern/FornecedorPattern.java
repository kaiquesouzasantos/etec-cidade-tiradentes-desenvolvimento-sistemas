package com.springcadastro.Pattern;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.Validator;
import br.com.caelum.stella.validation.ie.*;
import com.springcadastro.Model.Fornecedor;

public class FornecedorPattern {
    private final Fornecedor fornecedor;

    public FornecedorPattern(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

    public boolean verifica(){
        return
                verificaPreenchimento() && verificaCNPJ() && verificaInscricaoEstadual();
    }

    private boolean verificaPreenchimento(){
        if(
                fornecedor.getRazao().isEmpty() || fornecedor.getAtividade().isEmpty() ||
                fornecedor.getEmail().isEmpty() || fornecedor.getCnpj().isEmpty() ||
                fornecedor.getInscricaoEstadual().isEmpty() || fornecedor.getEndereco().isEmpty() ||
                fornecedor.getBairro().isEmpty() || fornecedor.getCidade().isEmpty() ||
                fornecedor.getEstado().isEmpty() || fornecedor.getCep().isEmpty()
        ){
            return false;
        }

        return true;
    }

    private boolean verificaCNPJ(){
        try{
            new CNPJValidator().assertValid(this.fornecedor.getCnpj());
            return true;
        }catch (InvalidStateException ignored){}

        return false;
    }

    private boolean verificaInscricaoEstadual(){
        try {
            verificaEstadoInscricaoEstadual(this.fornecedor.getEstado()).assertValid(this.fornecedor.getInscricaoEstadual());
            return true;
        } catch (Exception ignored){}

        return false;
    }

    private Validator<String> verificaEstadoInscricaoEstadual(String estado) {
        if(estado.equalsIgnoreCase("AC"))
            new IEAcreValidator();
        else if (estado.equalsIgnoreCase("AL"))
            return new IEAlagoasValidator();
        else if (estado.equalsIgnoreCase("AP"))
            return new IEAmapaValidator();
        else if (estado.equalsIgnoreCase("AM"))
            return new IEAmazonasValidator();
        else if (estado.equalsIgnoreCase("BA"))
            return new IEBahiaValidator();
        else if (estado.equalsIgnoreCase("CE"))
            return new IECearaValidator();
        else if (estado.equalsIgnoreCase("DF"))
            return new IEDistritoFederalValidator();
        else if (estado.equalsIgnoreCase("ES"))
            return new IEEspiritoSantoValidator();
        else if (estado.equalsIgnoreCase("GO"))
            return new IEGoiasValidator();
        else if (estado.equalsIgnoreCase("MA"))
            return new IEMaranhaoValidator();
        else if (estado.equalsIgnoreCase("MT"))
            return new IEMatoGrossoValidator();
        else if (estado.equalsIgnoreCase("MS"))
            return new IEMatoGrossoDoSulValidator();
        else if (estado.equalsIgnoreCase("MG"))
            return new IEMinasGeraisValidator();
        else if (estado.equalsIgnoreCase("PA"))
            return new IEParaValidator();
        else if (estado.equalsIgnoreCase("PB"))
            return new IEParaibaValidator();
        else if (estado.equalsIgnoreCase("PR"))
            return new IEParanaValidator();
        else if (estado.equalsIgnoreCase("PE"))
            return new IEPernambucoValidator();
        else if (estado.equalsIgnoreCase("RJ"))
            return new IERioDeJaneiroValidator();
        else if (estado.equalsIgnoreCase("RN"))
            return new IERioGrandeDoNorteValidator();
        else if (estado.equalsIgnoreCase("RS"))
            return new IERioGrandeDoSulValidator();
        else if (estado.equalsIgnoreCase("RO"))
            return new IERondoniaValidator();
        else if (estado.equalsIgnoreCase("RR"))
            return new IERoraimaValidator();
        else if (estado.equalsIgnoreCase("SC"))
            return new IESantaCatarinaValidator();
        else if (estado.equalsIgnoreCase("SP"))
            return new IESaoPauloValidator();
        else if (estado.equalsIgnoreCase("SE"))
            return new IESergipeValidator();
        else if (estado.equalsIgnoreCase("TO"))
            return new IETocantinsValidator();

        return null;
    }
}
