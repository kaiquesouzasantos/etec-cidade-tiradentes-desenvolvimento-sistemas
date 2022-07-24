package Funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto, valorComissao, imposto;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public double calcularComissao(){
        valorComissao = (salarioBruto * 0.12);
        return  valorComissao;
    }

    public double salarioLiquido(){
        return ((salarioBruto + valorComissao) - (salarioBruto * (imposto/100)));
    }

    @Override
    public String toString() {
        return "NOME: "+nome+"\nSALARIO LIQUIDO: R$"+salarioLiquido()+"\nCOMISSAO: R$"+calcularComissao();
    }
}
