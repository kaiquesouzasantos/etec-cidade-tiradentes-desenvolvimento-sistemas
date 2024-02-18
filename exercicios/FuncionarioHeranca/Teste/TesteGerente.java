package FuncionarioHeranca.Teste;
import FuncionarioHeranca.Entidades.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        gerente(new Gerente("gerente_01", "gerente_01", 10000));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        gerente(new Gerente( "gerente_02", "gerente_02", 1215451));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        gerente(new Gerente("gerente_03", "gerente_03", 1200));

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-04
        gerente(new Gerente("gerente_04", "gerente_04", 1500000));

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void gerente(Gerente gerente){
        gerente.setSenha(12345);

        System.out.println("NOME: "+gerente.getNome());
        System.out.println("CPF: "+gerente.getCpf());
        System.out.println("SALARIO: R$"+gerente.getSalario());
        System.out.println("SENHA: "+gerente.getSenha());
        System.out.println("COMISSAO: R$"+gerente.valorComissao());
    }
}
