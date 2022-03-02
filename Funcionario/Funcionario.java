package Funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto, valorComissao, imposto;

    public void calcularComissao(){
        valorComissao = (salarioBruto * 0.12);
        System.out.println("VALOR DA COMISSAO: R$"+valorComissao);
    }

    public void salarioLiquido(){
        System.out.println(nome+", SEU SALARIO LIQUIDO É DE R$"+((salarioBruto + valorComissao) - (salarioBruto * (imposto/100)))+"\n");
    }
}
