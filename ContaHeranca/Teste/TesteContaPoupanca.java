package ContaHeranca.Teste;
import ContaHeranca.Entidades.ContaPoupanca;

public class TesteContaPoupanca {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        contaPoupanca(new ContaPoupanca(12345, 123456789, "conta_01"), 200, 100);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        contaPoupanca(new ContaPoupanca(12345, 123456789, "conta_02"), 500, 5000);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        contaPoupanca(new ContaPoupanca(12345, 123456789, "conta_03"), 2021150, 100);

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void contaPoupanca(ContaPoupanca conta, double saqueValor, double depositoValor){
        conta.setSaldoConta(1000);
        conta.depositar(depositoValor);
        conta.sacar(saqueValor);

        System.out.println(conta.sacar(saqueValor));

        conta.calculaRendimento();
        System.out.println(conta.informacoes());
    }
}
