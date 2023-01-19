package ContaPolimorfismoRefatorada.Factory;

import ContaPolimorfismoRefatorada.Entidades.Conta;
import ContaPolimorfismoRefatorada.Entidades.ContaCorrente;
import ContaPolimorfismoRefatorada.Entidades.ContaPoupanca;

public class FactoryGeneric {
    public static Conta criaObjetoConta(Object opcao){
        if(opcao.equals("CONTA POUPANCA"))
            return new ContaPoupanca();
        else if(opcao.equals("CONTA CORRENTE"))
            return new ContaCorrente();
        return null;
    }

    public static int geraNumAgenciaConta(int digitos){
        return (int) (Math.random() * digitos);
    }

    public static ContaPoupanca retornaContaPoupanca(int senha, String titular, String cpf) {
        return new ContaPoupanca(
                200,
                FactoryGeneric.geraNumAgenciaConta(100000),
                FactoryGeneric.geraNumAgenciaConta(1000000000),
                senha, titular, cpf
        );
    }

    public static ContaCorrente retornaContaCorrente(int senha, String titular, String cpf) {
        return new ContaCorrente(
                200, 1000,
                FactoryGeneric.geraNumAgenciaConta(100000),
                FactoryGeneric.geraNumAgenciaConta(1000000000),
                senha, titular, cpf
        );
    }
}
