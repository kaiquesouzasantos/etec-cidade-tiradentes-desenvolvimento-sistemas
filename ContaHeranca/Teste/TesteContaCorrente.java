package ContaHeranca.Teste;
import ContaHeranca.Entidades.ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        contaCorrente(new ContaCorrente(12345, 123456789, "conta_01"), 200, 100);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        contaCorrente(new ContaCorrente(12345, 123456789, "conta_02"), 200000, 100);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        contaCorrente(new ContaCorrente(12345, 123456789, "conta_03"), 100, 100);

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void contaCorrente(ContaCorrente conta, double saqueValor, double depositoValor){
        conta.setSaldoConta(0);
        conta.setLimite(1000);
        conta.depositar(depositoValor);
        conta.sacar(saqueValor);

        System.out.println(conta.sacar(saqueValor));

        System.out.println(conta);
    }
}
