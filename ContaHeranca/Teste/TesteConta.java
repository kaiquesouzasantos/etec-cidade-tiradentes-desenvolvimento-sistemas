package ContaHeranca.Teste;
import ContaHeranca.Entidades.Conta;

public class TesteConta {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        conta(new Conta(12345, 123456789, "conta_01"), 200, 100);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        conta(new Conta(12345, 123456789, "conta_02"), 500, 5000);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        conta(new Conta(12345, 123456789, "conta_03"), 2021150, 100);

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void conta(Conta conta, double saqueValor, double depositoValor){
        conta.setSaldoConta(1000);
        conta.depositar(depositoValor);
        conta.sacar(saqueValor);

        if(conta.sacar(saqueValor)){
            System.out.println("-- SALDO INSUFICIENTE! --");
        }else{
            System.out.println("-- SAQUE REALIZADO COM SUCESSO! --");
        }

        System.out.println(conta.informacoes());
    }
}
