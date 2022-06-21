package Funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto, valorComissao, imposto;

    public String calcularComissao(){
        valorComissao = (salarioBruto * 0.12);
        return  "VALOR DA COMISSAO: R$"+valorComissao;
    }

    public String salarioLiquido(){
        return nome+", \nSEU SALARIO LIQUIDO E DE R$"+((salarioBruto + valorComissao) - (salarioBruto * (imposto/100)))+"\n";
    }
}
