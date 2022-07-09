package FuncionarioHeranca.Teste;
import FuncionarioHeranca.Entidades.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        funcionario(new Funcionario("funcionario_01", "funcionario_01", 10000));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        funcionario(new Funcionario("funcionario_02", "funcionario_02", 1215451));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        funcionario(new Funcionario("funcionario_03", "funcionario_03", 1200));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-04
        funcionario(new Funcionario("funcionario_04", "funcionario_04", 1500000));

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void funcionario(Funcionario funcionario){
        System.out.println("NOME: "+funcionario.getNome());
        System.out.println("CPF: "+funcionario.getCpf());
        System.out.println("SALARIO: R$"+funcionario.getSalario());
        System.out.println("COMISSAO: R$"+funcionario.valorComissao());
    }
}
