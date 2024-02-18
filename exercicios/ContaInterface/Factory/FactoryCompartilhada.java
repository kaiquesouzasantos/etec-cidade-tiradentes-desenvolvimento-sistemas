package ContaInterface.Factory;

import ContaInterface.Entidades.Conta;
import ContaInterface.Entidades.ContaCorrente;
import ContaInterface.Entidades.ContaPoupanca;
import ContaInterface.Entidades.ContaPremium;

import javax.swing.*;

public class FactoryCompartilhada {
    public static Conta criaObjetoConta(Object opcao){
        if(opcao.equals("CONTA POUPANCA"))
            return new ContaPoupanca();
        else if(opcao.equals("CONTA CORRENTE"))
            return new ContaCorrente();
        else if(opcao.equals("CONTA PREMIUM"))
            return new ContaPremium();
        return null;
    }

    public static int geraNumAgenciaConta(int digitos){
        return (int) (Math.random() * digitos);
    }

    public static ContaPoupanca retornaContaPoupanca(int senha, String titular, String cpf) {
        return new ContaPoupanca(
                200,
                geraNumAgenciaConta(100000),
                geraNumAgenciaConta(1000000000),
                senha, titular, cpf
        );
    }

    public static ContaCorrente retornaContaCorrente(int senha, String titular, String cpf) {
        return new ContaCorrente(
                200, 1000,
                geraNumAgenciaConta(100000),
                geraNumAgenciaConta(1000000000),
                senha, titular, cpf
        );
    }

    public static ContaPremium retornaContaPremium(int senha, String titular, String cpf) {
        return new ContaPremium(
                200, 5000,
                geraNumAgenciaConta(100000),
                geraNumAgenciaConta(1000000000),
                senha, titular, cpf
        );
    }

    public static String exibePerguntaRecebeResposta(String message, String title){
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }

    public static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }

    public static Object exibeMenuRecebeResposta(String message, String title, Object[] opcoes){
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }
}
